package com.valentinpopescu98.webapp.user.authorities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class UserAuthority {
    @Id
    @SequenceGenerator(allocationSize = 1, name = "user_authority_sequence", sequenceName = "user_authority_sequence")
    @GeneratedValue(generator = "user_authority_sequence", strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Role role;

    public UserAuthority(Role role) {
        this.role = role;
    }
}
