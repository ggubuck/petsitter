package com.pet.sitter.mainboard.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String pw;

    @Column
    private String name;

    @Column
    private String phone;

    @Column
    private String e_mail;

    @Column
    private String birth;

    @Column
    private String address;

    @Column
    private String nickname;

    @Column
    private String isshow;

    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    private List<Petsitter> petsitterList;


}
