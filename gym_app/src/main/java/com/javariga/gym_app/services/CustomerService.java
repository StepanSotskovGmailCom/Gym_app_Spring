package com.javariga.gym_app.services;

import com.javariga.gym_app.entities.Customer;
import com.javariga.gym_app.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;


    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
    public Optional<Customer> findById(Long id){
        return customerRepository.findById(id);
    }
    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }
//    public void updateCustomer(Customer customer, long id) {
//        Customer updatedCustomer = customerRepository.findById(id);
//        updatedCustomer.customer
//        customerRepository.update(customer);
//    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);

//    public Customer registerCustomer(Customer customer) {
//        boolean isUserExists = customerRepository.existsByUserName(customer.getUserName());
//        if (isUserExists) {
//            throw new RuntimeException("User with username " + Customer.getUserName() + " already exists");
//        }
//
//        var role = roleRepository.findByNameIgnoreCase(customer.getUserRole())
//                .orElseGet(() -> new Role(null, Customer.getUserRole()));
//
//        customer.setRoles(Set.of(role));
//        customer.setUserPassword(passwordEncoder.encode(customer.getUserPassword()));
//
//        return customerRepository.save(customer);
    }

}

