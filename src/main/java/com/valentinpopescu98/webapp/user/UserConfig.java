package com.valentinpopescu98.webapp.user;

import com.valentinpopescu98.webapp.user.authorities.UserAuthority;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

import static com.valentinpopescu98.webapp.user.authorities.Role.*;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            User user = new User("user", passwordEncoder.encode("123456"),
                    false, true, new UserAuthority(USER));

            User admin = new User("admin", passwordEncoder.encode("123456"),
                    false, true, new UserAuthority(ADMIN));

            User superadmin = new User("superadmin", passwordEncoder.encode("123456"),
                    false, true, new UserAuthority(SUPER_ADMIN));

            userRepository.saveAll(List.of(user, admin, superadmin));
        };
    }
}
