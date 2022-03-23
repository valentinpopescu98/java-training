package architectural.model_view_controller.service;

import architectural.model_view_controller.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void save(User user) {
        System.out.println(String.format("Service - Saving user: %s %s", user.getId(), user.getName()));
    }

    public User get(Long id) {
        System.out.println("Service - Get user by id=" + id);
        return new User(id, "Dummy User");
    }
}
