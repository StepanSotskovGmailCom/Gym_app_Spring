package com.javariga.gym_app.entities;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Table(name = "Trainer")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "trainer_id")
    private Long id;
    @Column(name = "trainer_name")
    private String trainerName;
    @Column(name = "trainer_surname")
    private String trainerSurname;
    @Column(name = "trainer_email")
    private String trainerEmail;
    @Column(name = "Activity_type_id")
    private Integer activityTypeId;
    @Column(name = "Role_ID")
    private Integer roleId;



}
