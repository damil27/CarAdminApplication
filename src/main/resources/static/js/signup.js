$('document').ready(function(){

    var password = document.getElementById("password");
    var confirmPassword = document.getElementById("onfirmPassword");

        function validatePassword(){
            if( password.value != confirmPassword.value){
                confirmPassword.setCustomValidity("Password does not match. try again");
            }else{
                confirmPassword.setCustomValidity("");
            }
        }
        password.onchange = validatePassword;
        confirmPassword.onkeyup = validatePassword;






});