package com.javariga.gym_app.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "Membership")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor

public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "membership_type")
    private String membershipType;

    private Integer price;


}
