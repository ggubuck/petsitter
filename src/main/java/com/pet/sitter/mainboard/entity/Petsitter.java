package com.pet.sitter.mainboard.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Petsitter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sitter_no;

    @Column
    private String pet_title;

    @Column
    private String pet_content;

    @Column
    private String category;

    @Column
    private LocalDateTime pet_date;

    @Column(name="pet_viewCnt")
    private Integer pet_viewCnt;

    @Column
    private Integer pet_like;

    @Column
    private Integer price;

    @Column
    private String pet_category;

    @Column
    private LocalDateTime start_time;

    @Column
    private LocalDateTime end_time;

    @ManyToOne
    @JoinColumn(name="id")
    private Member member;

    @ManyToOne
    @JoinColumn(name="pet_address_no")
    private AreaSearch areaSearch;

}
