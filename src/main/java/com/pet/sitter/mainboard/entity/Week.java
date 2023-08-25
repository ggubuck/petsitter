package com.pet.sitter.mainboard.entity;

import jakarta.persistence.*;

public class Week {
    @Id
    @ManyToOne
    @JoinColumn(name="sitter_no")
    private Petsitter petsitter;

    @Id
    @Column(name="week")
    private String week;
}
