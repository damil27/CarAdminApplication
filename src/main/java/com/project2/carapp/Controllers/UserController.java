package com.project2.carapp.Controllers;

import com.project2.carapp.Models.User;
import com.project2.carapp.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
@Controller
public class UserController {

    @Autowired private UserService userService;

    @GetMapping("/users")
    public String showUser(){
        return "login";
    }


    @PostMapping(value = "users/addNew")
    public RedirectView addNew(User user, RedirectAttributes redir){
        userService.saveUser(user);
        RedirectView redirectView = new RedirectView("/login", true);
        redir.addFlashAttribute("message", "You Successfully Registered!.You can Login now");
        return redirectView;

    }





}
