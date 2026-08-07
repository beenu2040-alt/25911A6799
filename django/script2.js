document.getElementById("registrationForm").addEventListener("submit",      
function(event) {     
    const username= document.getElementById("username").value.trim();
    const password= document.getElementById("password").value.trim();
    const dob = document.getElementById("dob").value; 
    const gender = document.querySelector('input[name="gender"]:checked');
    const email= document.getElementById("email").value.trim();
    const contact= document.getElementById("contact").value.trim();
    const address= document.getElementById("address").value.trim();

    const usernameRegex = /^[A-Za-z0-9_]{3,15}$/; 

    const passwordRegex = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{6,}$/; 

    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    const contactRegex = /^[0-9]{10}$/; 

    if(!usernameRegex.test(username)){
        alert("invalid username use 3 to 15 letters numbers underscores");
        return;
    }
    if(!passwordRegex.test(password)){
        alert("invalid password");
        return;
    }
    if(!dob){
        alert("enter dob");
        return;
    }
    if(!gender){
        alert("enter gender");
        return;
    }
    if(!emailRegex.test(email)){
        alert("invalid email");
        return;
    }
    if(!contactRegex.test(contact)){
        alert("invalid contact");
        return;
    }
    if (address.length < 5) { 
        alert("Address must be at least 5 characters long."); 
        return; 
    } 

    alert("response submitted")
});


