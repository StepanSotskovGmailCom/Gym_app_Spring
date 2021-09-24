package com.javariga.gym_app.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "Trainer_Role")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class TrainerRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "trainer_id")
    private String trainerId;
    @Column(name = "role_id")
    private String roleId;

}
