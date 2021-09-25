package com.javariga.gym_app.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "C_type")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class CType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "c_type_id")
    private Long id;

    @Column(name = "c_type_name")
    private String cTypeName;

    @ManyToOne(fetch = FetchType.LAZY)
    private CustomerType customerType;

}
