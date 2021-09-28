package com.javariga.gym_app.services;

import com.javariga.gym_app.entities.Administrator;
import com.javariga.gym_app.entities.AdministratorRole;
import com.javariga.gym_app.repository.AdministratorRepository;
import com.javariga.gym_app.repository.AdministratorRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AdministratorRoleService {

    private final AdministratorRoleRepository repository;

    @Autowired
    public AdministratorRoleService(AdministratorRoleRepository repository) {
        this.repository = repository;
    }

    public List<AdministratorRole> findAll() {
        return repository.findAll();
    }

    public Optional<AdministratorRole> findById(Long id) {
        return repository.findById(id);
    }
    

    public AdministratorRole save(AdministratorRole administratorRole) {
        return repository.save(administratorRole);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
