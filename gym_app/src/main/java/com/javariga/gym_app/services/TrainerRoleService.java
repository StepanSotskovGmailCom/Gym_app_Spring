package com.javariga.gym_app.services;

import com.javariga.gym_app.entities.Administrator;
import com.javariga.gym_app.entities.TrainerRole;
import com.javariga.gym_app.repository.AdministratorRepository;
import com.javariga.gym_app.repository.TrainerRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainerRoleService {
    private final TrainerRoleRepository repository;

    @Autowired
    public TrainerRoleService(TrainerRoleRepository repository) {
        this.repository = repository;
    }

    public List<TrainerRole> findAll() {
        return repository.findAll();
    }

    public Optional<TrainerRole> findById(Long id) {
        return repository.findById(id);
    }
    
    public TrainerRole save(TrainerRole trainerRole) {
        return repository.save(trainerRole);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
    
}
