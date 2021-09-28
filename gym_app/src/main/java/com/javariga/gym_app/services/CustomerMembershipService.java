package com.javariga.gym_app.services;


import com.javariga.gym_app.entities.CustomerMembership;
import com.javariga.gym_app.repository.CustomerMembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerMembershipService {
    private final CustomerMembershipRepository repository;

    @Autowired
    public CustomerMembershipService(CustomerMembershipRepository repository) {
        this.repository = repository;
    }

    public List<CustomerMembership> findAll() {
        return repository.findAll();
    }

    public Optional<CustomerMembership> findById(Long id) {
        return repository.findById(id);
    }

    public CustomerMembership save(CustomerMembership customerMembership) {
        return repository.save(customerMembership);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
