package com.javariga.gym_app.services;

import com.javariga.gym_app.entities.Administrator;
import com.javariga.gym_app.entities.Membership;
import com.javariga.gym_app.repository.AdministratorRepository;
import com.javariga.gym_app.repository.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MembershipService {
    private final MembershipRepository repository;

    @Autowired
    public MembershipService(MembershipRepository repository) {
        this.repository = repository;
    }

    public List<Membership> findAll() {
        return repository.findAll();
    }

    public Optional<Membership> findById(Long id) {
        return repository.findById(id);
    }
    
    public Membership save(Membership administrator) {
        return repository.save(administrator);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
