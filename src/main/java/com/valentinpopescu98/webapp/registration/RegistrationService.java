package com.valentinpopescu98.webapp.registration;

import com.valentinpopescu98.webapp.user.User;
import com.valentinpopescu98.webapp.user.UserService;
import com.valentinpopescu98.webapp.user.authorities.UserAuthority;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.valentinpopescu98.webapp.user.authorities.Role.USER;

@AllArgsConstructor
@Service
public class RegistrationService {
    private final UserService userService;

    public String registerSubmit(RegistrationRequest request) {
        return userService.signUpUser(new User(request.getUsername(), request.getPassword(),
                false, true, new UserAuthority(USER)));
    }
}
