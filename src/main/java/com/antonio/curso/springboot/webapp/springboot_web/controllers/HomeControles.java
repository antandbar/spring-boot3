package com.antonio.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControles {

    @GetMapping({"","/","/home"})
    public String home() {
        return "forward:/list";
    }
}
