package com.f1f1.f1f1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
/* 
    @GetMapping("/cars")
    public String cars() {
        return "cars";
    }

    @GetMapping("/circuits")
    public String circuits() {
        return "circuits";
    }
*/

    @GetMapping("/drivers")
    public String drivers() {
        return "drivers";
    }
}

