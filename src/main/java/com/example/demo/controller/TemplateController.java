package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TemplateController {
    @GetMapping
    public String getIndex() {
        return "index";
    }

    @GetMapping(path = "login")
    public String getLogin() {
        return "login";
    }

    @GetMapping(path = "cool-stuff")
    public String getCoolStuff() {
        return "cool-stuff";
    }
}
