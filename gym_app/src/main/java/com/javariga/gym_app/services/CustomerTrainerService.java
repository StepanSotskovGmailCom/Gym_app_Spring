package com.javariga.gym_app.services;

import com.javariga.gym_app.entities.CustomerTrainer;
import com.javariga.gym_app.repository.CustomerTrainersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerTrainerService {

    private final CustomerTrainersRepository repository;

    @Autowired
    public CustomerTrainerService(CustomerTrainersRepository repository) {
        this.repository = repository;
    }
    
    public List<CustomerTrainer> findAll() {
        return repository.findAll();
    }

    public Optional<CustomerTrainer> findById(Long id) {
        return repository.findById(id);
    }
    
    public CustomerTrainer save(CustomerTrainer customerTrainer) {
        return repository.save(customerTrainer);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
