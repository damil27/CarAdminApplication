package com.project2.carapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {
    @GetMapping("/contacts")
    public String  showContact(){

        return "contact";
    }

}
