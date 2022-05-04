package com.valentinpopescu98.webapp.user.authorities;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;

import static com.valentinpopescu98.webapp.user.authorities.Permission.READ;
import static com.valentinpopescu98.webapp.user.authorities.Permission.WRITE;
import static java.util.stream.Collectors.toSet;

public enum Role {
    USER(Set.of()),
    ADMIN(Set.of(READ)),
    SUPER_ADMIN(Set.of(READ, WRITE));

    private final Set<Permission> permissions;

    Role(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    private Set<Permission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
        Set<SimpleGrantedAuthority> authorities = getPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(permission.name()))
                .collect(toSet());

        authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return authorities;
    }
}
