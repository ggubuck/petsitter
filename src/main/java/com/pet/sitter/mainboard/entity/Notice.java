package com.pet.sitter.mainboard.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;

@Entity
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no_no;

    @Column(nullable = false, length = 45)
    private String no_tilte;

    @Column(nullable = false, columnDefinition = "text")
    private String no_content;

    @Column(nullable = false)
    private LocalDateTime no_date;

    @Column(nullable = false, name = "no_viewCnt")
    @ColumnDefault("0")
    private Integer no_viewCnt;

    @Column(nullable = true, length = 255)
    private String no_file;
}
