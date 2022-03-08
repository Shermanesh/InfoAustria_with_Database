package com.example.infoaustria.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "Profile")


public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String uuid;
    @OneToOne(mappedBy = "profile", optional = false)
    private User user;

    public Profile() {
        this.uuid = UUID.randomUUID().toString();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
