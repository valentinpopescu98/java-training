package com.valentinpopescu98.webapp.user;

import com.valentinpopescu98.webapp.user.authorities.UserAuthority;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User implements UserDetails {
    @Id
    @SequenceGenerator(allocationSize = 1, name = "user_sequence", sequenceName = "user_sequence")
    @GeneratedValue(generator = "user_sequence", strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private boolean isLocked = false;
    private boolean isEnabled = true;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "authority_id", referencedColumnName = "id")
    private UserAuthority userAuthority;

    public User(String username, String password, boolean isLocked, boolean isEnabled, UserAuthority userAuthority) {
        this.username = username;
        this.password = password;
        this.userAuthority = userAuthority;
        this.isLocked = isLocked;
        this.isEnabled = isEnabled;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !isLocked;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return userAuthority.getRole().getGrantedAuthorities();
    }
}
