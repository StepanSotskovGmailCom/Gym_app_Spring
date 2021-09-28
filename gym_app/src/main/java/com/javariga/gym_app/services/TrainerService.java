package com.javariga.gym_app.services;

import com.javariga.gym_app.entities.Administrator;
import com.javariga.gym_app.entities.Trainer;
import com.javariga.gym_app.repository.AdministratorRepository;
import com.javariga.gym_app.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainerService {
    private final TrainerRepository repository;

    @Autowired
    public TrainerService(TrainerRepository repository) {
        this.repository = repository;
    }

    public List<Trainer> findAll() {
        return repository.findAll();
    }

    public Optional<Trainer> findById(Long id) {
        return repository.findById(id);
    }
    
    public Trainer save(Trainer trainer) {
        return repository.save(trainer);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
