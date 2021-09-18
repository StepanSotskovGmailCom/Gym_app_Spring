package com.javariga.gym_app.entities;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "Customer_trainers")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class CustomerTrainers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "customer_id")
    private Integer customerId;
    @Column(name = "trainer_id")
    private Integer trainerId;

}
