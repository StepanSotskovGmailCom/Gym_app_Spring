package com.javariga.gym_app.entities;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Set;

@Table(name = "Customer_membership")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class CustomerMembership {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "membership_id")
    private Integer membershipId;
    @Column(name = "customer_id")
    private Integer customerId;
    @Column(name ="membership_start_date" )
    private Date membershipStartDate;
    @Column(name ="membership_end_date" )
    private Date membershipEndDate;
    @Column(name ="membership_expiration" )
    private Date membershipExpiration;
    @Column(name ="membership_type" )
    private String membershipType;
    @Column(name ="membership_price" )
    private Float membershipPrice;

    @OneToMany(mappedBy = "customerMembership",cascade = CascadeType.ALL)
    private Set<Customer> customers;

    @OneToMany(mappedBy = "customerMembership",cascade = CascadeType.ALL)
    private List<Membership> memberships;


}
