package com.example.demo.auth;

import java.util.Optional;

public interface AppUserDao {
    Optional<AppUser> selectUserByUsername(String username);
}
