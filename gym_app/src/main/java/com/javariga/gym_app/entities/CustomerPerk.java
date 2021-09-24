package com.javariga.gym_app.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "Customer_perk")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class CustomerPerk {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "customer_id")
    private Integer customerId;
    @Column(name = "perk_id")
    private Integer perkId;
}
