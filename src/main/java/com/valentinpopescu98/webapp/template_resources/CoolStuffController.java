package com.valentinpopescu98.webapp.template_resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cool-stuff")
public class CoolStuffController {
    @GetMapping
    public String getCoolStuff() {
        return "cool-stuff";
    }
}
