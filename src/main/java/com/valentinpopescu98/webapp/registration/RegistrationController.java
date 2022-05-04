package com.valentinpopescu98.webapp.registration;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@Controller
@RequestMapping("register")
public class RegistrationController {
    private final RegistrationService registrationService;

    @GetMapping
    public String registerForm() {
        return "register";
    }

    @PostMapping
    public @ResponseBody String registerSubmit(@ModelAttribute RegistrationRequest request) {
        return registrationService.registerSubmit(request);
    }
}
