package com.javariga.gym_app.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Table(name = "Customer")
@Entity
@Getter
@Setter
@ToString
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
    @Column(name = "trainer_id")
    private String trainerId;
    @Column(name = "membership_id")
    private String membershipId;
    @Column(name = "customer_type_id")
    private String customerId;

//    @OneToMany
//    private Set<CustomerTrainers> customerTrainersList;

}
