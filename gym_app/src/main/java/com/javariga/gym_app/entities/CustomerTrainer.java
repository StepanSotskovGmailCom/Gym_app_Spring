package com.javariga.gym_app.entities;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Table(name = "Customer_trainer")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class CustomerTrainer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "customer_id")
    private Integer customerId;
    @Column(name = "trainer_id")
    private Integer trainerId;

    @OneToMany(mappedBy = "customerTrainer",cascade = CascadeType.ALL)
    private List<Customer> customers;

    @OneToMany(mappedBy = "customerTrainer",cascade = CascadeType.ALL)
    private Set<Trainer> trainers;




}
