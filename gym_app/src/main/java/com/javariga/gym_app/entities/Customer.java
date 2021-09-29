package com.javariga.gym_app.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Set;

@Table(name = "Customer")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;
    @Column(name = "customer_name")
//    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 40, message = "Name should be between 2 and 40 characters")
    private String customerName;
    @Column(name = "customer_surname")
    @NotEmpty(message = "Surname should not be empty")
    @Size(min = 2, max = 40, message = "Surname should be between 2 and 40 characters")
    private String customerSurname;
    @Column(name="personal_code")
    @Size(min = 11, max = 11, message = "Personal code should be 11 digit long")
    private String personalCode;
    @Column(name = "customer_email")
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    private String customerEmail;

//    Collection<Role> roles;


//    @ManyToOne(fetch = FetchType.LAZY)
//    private CustomerTrainer customerTrainer;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    private CustomerMembership customerMembership;
//
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    private CustomerType customerType;



}
