package com.javariga.gym_app.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Table(name = "Customer_type")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "customer_id")
    private Integer customerId;
    @Column(name = "c_type_id")
    private Integer cTypeId;
//
//    @OneToMany(mappedBy = "customerType",cascade = CascadeType.ALL)
//    private Set<Customer> customers;
//
//    @OneToMany(mappedBy = "customerType",cascade = CascadeType.ALL)
//    private List<CType> cTypes;
}
