package com.javariga.gym_app.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "Perk")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Perk {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "perk_id")
    private Long id;

    @Column(name = "perk_name")
    private String perkName;


}
