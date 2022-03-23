package architectural.model_view_controller.controller;

import architectural.model_view_controller.model.User;
import architectural.model_view_controller.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public String save(@ModelAttribute User user, Model model) {
        System.out.println(String.format("Controller - Saving user: %s %s", user.getId(), user.getName()));
        userService.save(user);
        model.addAttribute("user", new User());

        return "success";
    }

    @GetMapping("/user")
    public String get(Model model) {
        model.addAttribute("user", new User());

        return "addUser";
    }
}
