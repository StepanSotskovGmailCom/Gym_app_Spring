package com.javariga.gym_app.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

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

    @OneToMany(mappedBy = "trainerRole",cascade = CascadeType.ALL)
    private List<Role> roles;

    @OneToMany(mappedBy = "trainerRole", cascade = CascadeType.ALL)
    private Set<Trainer> trainers;

}
