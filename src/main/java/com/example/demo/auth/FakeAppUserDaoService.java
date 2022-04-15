package com.example.demo.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.example.demo.security.AppUserRole.*;

@Repository("fake")
public class FakeAppUserDaoService implements AppUserDao {
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public FakeAppUserDaoService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Optional<AppUser> selectUserByUsername(String username) {
        return getUsers().stream()
                         .filter(user -> username.equals(user.getUsername()))
                         .findFirst();
    }

    private List<AppUser> getUsers() {
        List<AppUser> users = new ArrayList<>();

        users.add(new AppUser(
                "user", passwordEncoder.encode("123456"), USER.getGrantedAuthorities(),
                        true, true, true, true));

        users.add(new AppUser(
                "admin", passwordEncoder.encode("123456"), ADMIN.getGrantedAuthorities(),
                true, true, true, true));

        users.add(new AppUser(
                "superadmin", passwordEncoder.encode("123456"), SUPER_ADMIN.getGrantedAuthorities(),
                true, true, true, true));

        return users;
    }
}
