// ===== PRODUCT DATA =====
const products = [
  {
    id: 1,
    name: 'Camel Cashmere Overcoat',
    category: 'Outerwear',
    price: 2890,
    originalPrice: null,
    image: 'images/product_coat.jpg',
    badge: 'Bestseller'
  },
  {
    id: 2,
    name: 'Forest Silk Blouse',
    category: 'Tops',
    price: 680,
    originalPrice: null,
    image: 'images/product_blouse.jpg',
    badge: null
  },
  {
    id: 3,
    name: 'Tailored Wool Trousers',
    category: 'Bottoms',
    price: 590,
    originalPrice: 740,
    image: 'images/product_trousers.jpg',
    badge: 'Sale'
  },
  {
    id: 4,
    name: 'Ivory Silk Midi Dress',
    category: 'Dresses',
    price: 1250,
    originalPrice: null,
    image: 'images/product_dress.jpg',
    badge: 'New'
  },
  {
    id: 5,
    name: 'Cashmere Knit Sweater',
    category: 'Knitwear',
    price: 520,
    originalPrice: null,
    image: 'images/product_knit.jpg',
    badge: null
  },
  {
    id: 6,
    name: 'Double-Breasted Blazer',
    category: 'Outerwear',
    price: 1680,
    originalPrice: null,
    image: 'images/product_blazer.jpg',
    badge: 'Bestseller'
  },
  {
    id: 7,
    name: 'Heritage Silk Scarf',
    category: 'Accessories',
    price: 340,
    originalPrice: null,
    image: 'images/product_scarf.jpg',
    badge: null
  },
  {
    id: 8,
    name: 'Merino Lounge Knit',
    category: 'Knitwear',
    price: 420,
    originalPrice: 560,
    image: 'images/product_knit.jpg',
    badge: 'Sale'
  }
];

// ===== CART STATE =====
let cart = [];

// ===== DOM REFERENCES =====
const cartDrawer = document.getElementById('cart-drawer');
const cartOverlay = document.getElementById('cart-overlay');
const cartItemsContainer = document.getElementById('cart-items');
const cartSubtotalEl = document.getElementById('cart-subtotal');
const cartCountEl = document.getElementById('cart-count');
const cartHeaderCount = document.getElementById('cart-header-count');
const toast = document.getElementById('toast');
const toastMessage = document.getElementById('toast-message');

// ===== NAVBAR SCROLL EFFECT =====
const navbar = document.querySelector('.navbar');
let lastScrollY = 0;

window.addEventListener('scroll', () => {
  const scrollY = window.scrollY;

  if (scrollY > 50) {
    navbar.classList.add('scrolled');
  } else {
    navbar.classList.remove('scrolled');
  }

  lastScrollY = scrollY;
});

// ===== INTERSECTION OBSERVER FOR ANIMATIONS =====
const observerOptions = {
  threshold: 0.1,
  rootMargin: '0px 0px -50px 0px'
};

const animationObserver = new IntersectionObserver((entries) => {
  entries.forEach(entry => {
    if (entry.isIntersecting) {
      entry.target.classList.add('visible');
      animationObserver.unobserve(entry.target);
    }
  });
}, observerOptions);

// Observe all animatable elements
function initAnimations() {
  const animatedElements = document.querySelectorAll('.fade-in, .fade-in-left, .fade-in-right, .fade-in-scale');
  animatedElements.forEach(el => animationObserver.observe(el));
}

// ===== RENDER PRODUCTS =====
function renderProducts() {
  const grid = document.getElementById('product-grid');

  products.forEach((product, index) => {
    const card = document.createElement('div');
    card.className = `product-card fade-in-scale delay-${(index % 4) + 1}`;
    card.innerHTML = `
      <div class="product-image-wrap">
        <img src="${product.image}" alt="${product.name}" loading="lazy">
        ${product.badge ? `<span class="product-badge">${product.badge}</span>` : ''}
        <div class="quick-add-overlay">
          <button class="quick-add-btn" onclick="addToCart(${product.id})" aria-label="Quick add ${product.name}">
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="none" stroke="currentColor"><path d="M6 2L3 6v14a2 2 0 002 2h14a2 2 0 002-2V6l-3-4z"/><line x1="3" y1="6" x2="21" y2="6"/><path d="M16 10a4 4 0 01-8 0"/></svg>
            <span>Quick Add</span>
          </button>
        </div>
      </div>
      <div class="product-info">
        <p class="product-category">${product.category}</p>
        <h3 class="product-name">${product.name}</h3>
        <p class="product-price">
          $${product.price.toLocaleString()}
          ${product.originalPrice ? `<span class="original-price">$${product.originalPrice.toLocaleString()}</span>` : ''}
        </p>
      </div>
    `;
    grid.appendChild(card);
  });
}

// ===== CART FUNCTIONS =====
function addToCart(productId) {
  const product = products.find(p => p.id === productId);
  if (!product) return;

  const existingItem = cart.find(item => item.id === productId);

  if (existingItem) {
    existingItem.qty += 1;
  } else {
    cart.push({ ...product, qty: 1 });
  }

  updateCart();
  openCartDrawer();
  showToast(`${product.name} added to bag`);
}

function removeFromCart(productId) {
  cart = cart.filter(item => item.id !== productId);
  updateCart();
}

function updateQty(productId, delta) {
  const item = cart.find(i => i.id === productId);
  if (!item) return;

  item.qty += delta;
  if (item.qty <= 0) {
    removeFromCart(productId);
    return;
  }

  updateCart();
}

function updateCart() {
  const totalItems = cart.reduce((sum, item) => sum + item.qty, 0);
  const subtotal = cart.reduce((sum, item) => sum + (item.price * item.qty), 0);

  // Update count badge
  cartCountEl.textContent = totalItems;
  if (totalItems > 0) {
    cartCountEl.classList.add('active');
  } else {
    cartCountEl.classList.remove('active');
  }

  // Update header count
  cartHeaderCount.textContent = `${totalItems} item${totalItems !== 1 ? 's' : ''}`;

  // Update subtotal
  cartSubtotalEl.textContent = `$${subtotal.toLocaleString()}`;

  // Render cart items
  renderCartItems();
}

function renderCartItems() {
  if (cart.length === 0) {
    cartItemsContainer.innerHTML = `
      <div class="cart-empty">
        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="none" stroke="currentColor">
          <path d="M6 2L3 6v14a2 2 0 002 2h14a2 2 0 002-2V6l-3-4z"/>
          <line x1="3" y1="6" x2="21" y2="6"/>
          <path d="M16 10a4 4 0 01-8 0"/>
        </svg>
        <p>Your bag is empty</p>
        <span>Discover our curated collection</span>
      </div>
    `;
    return;
  }

  cartItemsContainer.innerHTML = cart.map(item => `
    <div class="cart-item" id="cart-item-${item.id}">
      <div class="cart-item-image">
        <img src="${item.image}" alt="${item.name}">
      </div>
      <div class="cart-item-info">
        <div>
          <p class="cart-item-name">${item.name}</p>
          <p class="cart-item-category">${item.category}</p>
        </div>
        <div class="cart-item-bottom">
          <div class="cart-item-qty">
            <button onclick="updateQty(${item.id}, -1)" aria-label="Decrease quantity">−</button>
            <span>${item.qty}</span>
            <button onclick="updateQty(${item.id}, 1)" aria-label="Increase quantity">+</button>
          </div>
          <span class="cart-item-price">$${(item.price * item.qty).toLocaleString()}</span>
        </div>
        <button class="cart-item-remove" onclick="removeFromCart(${item.id})">Remove</button>
      </div>
    </div>
  `).join('');
}

// ===== CART DRAWER =====
function openCartDrawer() {
  cartDrawer.classList.add('active');
  cartOverlay.classList.add('active');
  document.body.style.overflow = 'hidden';
}

function closeCartDrawer() {
  cartDrawer.classList.remove('active');
  cartOverlay.classList.remove('active');
  document.body.style.overflow = '';
}

// ===== TOAST =====
let toastTimeout;

function showToast(message) {
  clearTimeout(toastTimeout);
  toastMessage.textContent = message;
  toast.classList.add('active');

  toastTimeout = setTimeout(() => {
    toast.classList.remove('active');
  }, 2800);
}

// ===== EVENT LISTENERS =====
document.getElementById('cart-toggle').addEventListener('click', () => {
  if (cartDrawer.classList.contains('active')) {
    closeCartDrawer();
  } else {
    openCartDrawer();
  }
});

document.getElementById('cart-close').addEventListener('click', closeCartDrawer);
cartOverlay.addEventListener('click', closeCartDrawer);

// Close on ESC
document.addEventListener('keydown', (e) => {
  if (e.key === 'Escape') closeCartDrawer();
});

// ===== NEWSLETTER FORM =====
document.getElementById('newsletter-form').addEventListener('submit', (e) => {
  e.preventDefault();
  const input = e.target.querySelector('input');
  if (input.value.trim()) {
    showToast('Welcome to Maison — check your inbox');
    input.value = '';
  }
});

// ===== SMOOTH SCROLL FOR NAV LINKS =====
document.querySelectorAll('a[href^="#"]').forEach(link => {
  link.addEventListener('click', (e) => {
    const href = link.getAttribute('href');
    if (href === '#') return;
    e.preventDefault();
    const target = document.querySelector(href);
    if (target) {
      const offsetTop = target.getBoundingClientRect().top + window.scrollY - 80;
      window.scrollTo({ top: offsetTop, behavior: 'smooth' });
    }
  });
});

// ===== INIT =====
document.addEventListener('DOMContentLoaded', () => {
  renderProducts();
  initAnimations();
  renderCartItems();
});
