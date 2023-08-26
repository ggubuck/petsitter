package com.pet.sitter.mainboard.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class AreaSearch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pet_address_no;

    @Column
    private String gu;

    @Column
    private String roadname;

    @Column
    private String detail_address;

    @Column
    private String post;

    @OneToMany(mappedBy = "areaSearch", cascade = CascadeType.REMOVE)
    private List<Petsitter> petsitterList;

}
