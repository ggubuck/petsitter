package com.pet.sitter.mainboard;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class PetSitter {

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

    @Column
    private Integer pet_view_cnt;

    @Column
    private Integer like;

    @Column
    private Integer price;

    @Column
    private String id;

    @Column
    private String pet_category;

    @Column
    private LocalDateTime star_time;

    @Column
    private LocalDateTime end_time;
}
