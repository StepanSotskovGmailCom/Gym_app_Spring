package com.javariga.gym_app.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Table(name = "Administrator_Role")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class AdministratorRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "administrator_id")
    private Integer admimistratorId;

    @Column(name = "role_id")
    private Integer roleId;

//    @OneToMany(mappedBy = "administratorRole",cascade = CascadeType.ALL)
//   // @JoinColumn(name = "ID")
//    private Set<Administrator> administrators;
//
//    @OneToMany(mappedBy = "administratorRole", cascade = CascadeType.ALL)
//    //@JoinColumn(name = "Role_ID")
//    private Set<Role> roles;


}
