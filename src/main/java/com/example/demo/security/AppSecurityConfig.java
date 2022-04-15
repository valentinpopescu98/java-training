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
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.util.concurrent.TimeUnit;

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
        http
            .csrf()
                .disable()
            .authorizeRequests()
                .antMatchers("/", "/index", "/css/*", "/js/*")
                    .permitAll()
                .anyRequest()
                    .authenticated()
            .and()
                .formLogin()
                    .loginPage("/login")
                        .permitAll()
                        .defaultSuccessUrl("/cool-stuff", true)
                        .usernameParameter("username")
                        .passwordParameter("password")
            .and()
                .rememberMe()
                    .tokenValiditySeconds((int) TimeUnit.DAYS.toSeconds(14))
                    .key("secret")
                    .rememberMeParameter("remember-me")
            .and()
                .logout()
//                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout", "POST")) // only for CSRF enabled
                    .logoutUrl("/logout")
                    .logoutSuccessUrl("/")
                    .clearAuthentication(true)
                    .invalidateHttpSession(true)
                    .deleteCookies("JSESSIONID");
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
        UserDetails user = User.builder()
                               .username("user")
                               .password(passwordEncoder.encode("123456"))
                               .authorities(USER.getGrantedAuthorities())
                               .build();

        UserDetails admin = User.builder()
                                .username("admin")
                                .password(passwordEncoder.encode("123456"))
                                .authorities(ADMIN.getGrantedAuthorities())
                                .build();

        UserDetails superAdmin = User.builder()
                                     .username("superadmin")
                                     .password(passwordEncoder.encode("123456"))
                                     .authorities(SUPER_ADMIN.getGrantedAuthorities())
                                     .build();

        return new InMemoryUserDetailsManager(user, admin, superAdmin);
    }
}
