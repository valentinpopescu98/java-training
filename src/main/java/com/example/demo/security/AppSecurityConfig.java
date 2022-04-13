package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import static com.example.demo.security.AppUserRole.*;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public AppSecurityConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeRequests()
            .antMatchers("/", "index", "/css/*", "/js/*").permitAll()
//            .antMatchers(POST, "/api/v*/**").hasAuthority(WRITE.name())
//            .antMatchers(PUT, "/api/v*/**").hasAuthority(WRITE.name())
//            .antMatchers(DELETE, "/api/v*/**").hasAuthority(WRITE.name())
//            .antMatchers(GET,"/api/v*/**").hasAnyRole(ADMIN.name(), SUPER_ADMIN.name())
//            .antMatchers(GET,"/api/v*/**").hasAuthority(READ.name())
            .anyRequest()
            .authenticated().and().httpBasic();
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
        UserDetails user = User.builder()
                               .username("user")
                               .password(passwordEncoder.encode("123456"))
//                               .roles(USER.name())
                               .authorities(USER.getGrantedAuthorities())
                               .build();

        UserDetails admin = User.builder()
                                .username("admin")
                                .password(passwordEncoder.encode("123456"))
//                                .roles(ADMIN.name())
                                .authorities(ADMIN.getGrantedAuthorities())
                                .build();

        UserDetails superAdmin = User.builder()
                                     .username("superadmin")
                                     .password(passwordEncoder.encode("123456"))
//                                     .roles(SUPER_ADMIN.name())
                                     .authorities(SUPER_ADMIN.getGrantedAuthorities())
                                     .build();

        return new InMemoryUserDetailsManager(user, admin, superAdmin);
    }
}
