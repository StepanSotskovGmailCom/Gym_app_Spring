package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.AdministratorRole;
import com.javariga.gym_app.entities.CustomerPerk;
import com.javariga.gym_app.repository.AdministratorRoleRepository;
import com.javariga.gym_app.repository.CustomerPerkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/customerPerk", produces = APPLICATION_JSON_VALUE)

public class CustomerPerkController {
    private final CustomerPerkRepository repository;

    @Autowired
    public CustomerPerkController(CustomerPerkRepository repository) {
        this.repository = repository;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public CustomerPerk create(@RequestBody CustomerPerk request) {
        return repository.save(request);
    }

    @GetMapping
    public CustomerPerk get(@RequestParam Long id) {
        return repository.findById(id).get();
    }

    @PutMapping
    public CustomerPerk update(@RequestBody CustomerPerk request) {
        return repository.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        repository.deleteById(id);
        return "CustomerPerk with ID + " + id + " deleted";
    }

}
