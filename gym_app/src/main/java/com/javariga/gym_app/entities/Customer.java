package com.javariga.gym_app.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Table(name = "Customer")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Long id;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "customer_surname")
    private String customerSurname;
    @Column(name = "customer_email")
    private String customerEmail;

//    @OneToMany(mappedBy = "customer")
//    private Set<CustomerType> customerTypes;
//
//    @OneToMany(mappedBy = "customer")
//    private Set<CustomerTrainers> customerTrainers;
//
//    @OneToMany(mappedBy = "customer")
//    private Set<CustomerMembership> customerMemberships;

}
