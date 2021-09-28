package com.javariga.gym_app.services;

import com.javariga.gym_app.entities.AdministratorRole;
import com.javariga.gym_app.entities.CType;
import com.javariga.gym_app.repository.AdministratorRoleRepository;
import com.javariga.gym_app.repository.CTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CTypeService {
    private final CTypeRepository repository;

    @Autowired
    public CTypeService(CTypeRepository repository) {
        this.repository = repository;
    }

    public List<CType> findAll() {
        return repository.findAll();
    }

    public Optional<CType> findById(Long id) {
        return repository.findById(id);
    }
    
    public CType save(CType cType) {
        return repository.save(cType);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
