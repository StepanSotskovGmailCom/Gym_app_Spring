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


    @ManyToOne(fetch = FetchType.LAZY)
    private CustomerTrainer customerTrainer;

    @ManyToOne(fetch = FetchType.LAZY)
    private CustomerMembership customerMembership;


    @ManyToOne(cascade = CascadeType.ALL)
    private CustomerType customerType;



}
