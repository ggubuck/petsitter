package com.pet.sitter.member.entity;

import com.pet.sitter.mainboard.PetSitter;
import jakarta.persistence.*;

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

    @OneToMany
    private PetSitter petSitter;
}
