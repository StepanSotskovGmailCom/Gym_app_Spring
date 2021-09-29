package com.javariga.gym_app.services;

import com.javariga.gym_app.entities.Administrator;
import com.javariga.gym_app.entities.CustomerType;
import com.javariga.gym_app.repository.AdministratorRepository;
import com.javariga.gym_app.repository.CustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerTypeService {
    private final CustomerTypeRepository repository;

    @Autowired
    public CustomerTypeService(CustomerTypeRepository repository) {
        this.repository = repository;
    }

    public List<CustomerType> findAll() {
        return repository.findAll();
    }

    public Optional<CustomerType> findById(Long id) {
        return repository.findById(id);
    }
    
    public CustomerType save(CustomerType customerType) {
        return repository.save(customerType);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
