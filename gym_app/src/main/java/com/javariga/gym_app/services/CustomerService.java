package com.javariga.gym_app.services;

import com.javariga.gym_app.entities.Customer;
import com.javariga.gym_app.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    @Autowired
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> findAll() {
        return repository.findAll();
    }

    public Optional<Customer> findById(Long id) {
        return repository.findById(id);
    }


    public Customer findByName(String name) {
        return repository.findByCustomerName(name);
    }

    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Customer findByPersonalCode(Integer code) {
        return repository.findByPersonalCode(code);
    }


}

