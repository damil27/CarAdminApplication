package com.project2.carapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationControlller {

    @GetMapping("/")
    public String showIndex(){
        return "index";
    }

    @GetMapping("/login")
    public String showLogin(){
        return "login";
    }

    @GetMapping("/logout")
    public String showLogout(){
        return "login";
    }

    @GetMapping("/register")
    public String showRegister(){
        return "register";
    }
}
