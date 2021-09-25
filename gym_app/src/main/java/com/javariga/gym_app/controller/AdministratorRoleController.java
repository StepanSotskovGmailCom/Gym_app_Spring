package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.AdministratorRole;
import com.javariga.gym_app.entities.CustomerMembership;
import com.javariga.gym_app.repository.AdministratorRoleRepository;
import com.javariga.gym_app.repository.CustomerMembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping("/administratorRole")
public class AdministratorRoleController {
    private final AdministratorRoleRepository repository;

    @Autowired
    public AdministratorRoleController(AdministratorRoleRepository repository) {
        this.repository = repository;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public AdministratorRole create(@RequestBody AdministratorRole request) {
        return repository.save(request);
    }

    @GetMapping
    public AdministratorRole get(@RequestParam Long id) {
        return repository.findById(id).get();
    }

    @PutMapping
    public AdministratorRole update(@RequestBody AdministratorRole request) {
        return repository.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        repository.deleteById(id);
        return "AdministratorRole with ID + " + id + " deleted";
    }
}
