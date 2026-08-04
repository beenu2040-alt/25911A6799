const button1 = document.getElementById("submit");
const button2 = document.getElementById("next");
const div = document.getElementById("thankYouPage");
const home = document.getElementById("homepage");
const next = document.getElementById("nextpage");


button1.addEventListener("click", (event) =>{
    event.preventDefault();
    home.style.display="none";
    div.style.display = "flex";
    alert("response submitted")
    
});
button2.addEventListener("click", (event) =>{
    event.preventDefault();
    div.style.display="none";
    next.style.display = "flex";
    
});

