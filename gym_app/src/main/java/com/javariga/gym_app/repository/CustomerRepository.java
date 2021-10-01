package com.javariga.gym_app.repository;

import com.javariga.gym_app.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository

public interface CustomerRepository extends JpaRepository<Customer, Long> {

//    Optional<Customer> findByCustomerName(String name);
//
//    Optional<Customer> findByPersonalCode(String personalCode);

}
