package com.javariga.gym_app.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Table(name = "Role")
@Entity
@Getter
@Setter
@RequiredArgsConstructor

public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Role_ID")
    private Long id;

    @Column(name = "Role")
    private String role;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private AdministratorRole administratorRole;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    private TrainerRole trainerRole;
}
