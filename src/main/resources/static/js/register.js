



$('document').ready(function(){

         var password = document.getElementById("password")
         var confirmPassword = document.getElementById("confirmPassword");

             function validatePassword(){
                 if( password.value != confirmPassword.value){
                     confirmPassword.setCustomValidity("Password do not match. try again");
                 }else{
                     confirmPassword.setCustomValidity("");
                 }
             }
             password.onchange = validatePassword;
             confirmPassword.onkeyup = validatePassword;


     });

//
//     $('document').ready(function(){
//
//     $("#password,#confirmPassword").keyup(checkPasswordMatch);
//     	var password = $("#password").val();
//     	var confirmPassword = $("#confirmPassword").val();
//
//     	function checkPasswordMatch(){
//     	  if(password.value != confirmPassword.value) {
//     	    $("#checkPasswordMatch").html("Passwords Do not Match");
//     	  } else {
//     	  $("#checkPasswordMatch").html("Passwords Match");
//     	  }
//     	}
//
//
//     });