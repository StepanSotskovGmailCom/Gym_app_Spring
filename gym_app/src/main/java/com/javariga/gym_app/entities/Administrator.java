package com.javariga.gym_app.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "Administrator")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Administrator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    private String name;

    @Column(name = "Role_ID")
    private String roleId;


}
