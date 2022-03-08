package com.example.infoaustria.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "Users")

public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String uuid;

    private String login;
    private String name;
    private int age;
    private char gender;
    private String state;
    private char[] password;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Profile_id", referencedColumnName = "id")
    private Profile profile;


    public User() {
        this.profile = new Profile();
        this.uuid = UUID.randomUUID().toString();
    }

    public User(User u) {
        this.id = u.id;
        this.uuid = u.uuid;
        this.login = u.login;
        this.name = u.name;
        this.age = u.age;
        this.gender = u.gender;
        this.state = u.state;
        this.password = u.password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
