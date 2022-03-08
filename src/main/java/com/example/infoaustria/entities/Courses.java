package com.example.infoaustria.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "Courses")

public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String uuid;

    private String name;
    private String financing;
    private String specialization;
    private int maxSum;

    public Courses() {
        this.uuid = UUID.randomUUID().toString();
    }

    public Courses(Courses c) {
        this.id = c.id;
        this.uuid = c.uuid;
        this.name = c.name;
        this.financing = c.financing;
        this.specialization = c.specialization;
        this.maxSum = c.maxSum;
    }
}
