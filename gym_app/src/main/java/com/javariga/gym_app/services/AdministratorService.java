package com.javariga.gym_app.services;

import com.javariga.gym_app.entities.Administrator;
import com.javariga.gym_app.repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministratorService {

    private final AdministratorRepository repository;

    @Autowired
    public AdministratorService(AdministratorRepository repository) {
        this.repository = repository;
    }

    public List<Administrator> findAll() {
        return repository.findAll();
    }

    public Optional<Administrator> findById(Long id) {
        return repository.findById(id);
    }


//    public Administrator findByName(String name) {
//        return repository.findByAdministratorName(name);
//    }

    public Administrator save(Administrator administrator) {
        return repository.save(administrator);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }


}
