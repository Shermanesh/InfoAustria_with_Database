package com.example.infoaustria.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "FinanceRate")

public class FinanceRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String uuid;

    private String incomeLevel;
    private int minIncome;
    private int maxIncome;
    private int rate;

    public FinanceRate() {
        this.uuid = UUID.randomUUID().toString();
    }

    public FinanceRate(FinanceRate fr) {
        this.id = fr.id;
        this.uuid = fr.uuid;
        this.incomeLevel =fr.incomeLevel;
        this.minIncome = fr.minIncome;
        this.maxIncome = fr.maxIncome;
        this.rate = fr.rate;
    }
}
