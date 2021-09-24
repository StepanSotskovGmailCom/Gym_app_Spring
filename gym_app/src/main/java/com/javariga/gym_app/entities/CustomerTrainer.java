package com.javariga.gym_app.entities;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

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

//    @ManyToOne(cascade = CascadeType.ALL) //
////    @JoinColumn(name="Role_ID")
//    private Trainer trainer;
//
//    @ManyToOne(cascade = CascadeType.ALL) //
////    @JoinColumn(name="Role_ID")
//    private Customer customer;

}
