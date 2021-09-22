package com.javariga.gym_app.controller;


import com.javariga.gym_app.entities.CustomerMembership;
import com.javariga.gym_app.repository.CustomerMembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping(value = "/customerMembership", produces = APPLICATION_JSON_VALUE)

public class CustomerMembershipController {

    private final CustomerMembershipRepository repository;

    @Autowired
    public CustomerMembershipController(CustomerMembershipRepository repository) {
        this.repository = repository;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public CustomerMembership create(@RequestBody CustomerMembership request) {
        return repository.save(request);
    }

    @GetMapping
    public CustomerMembership get(@RequestParam Long id) {
        return repository.findById(id).get();
    }

    @PutMapping
    public CustomerMembership update(@RequestBody CustomerMembership request) {
        return repository.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        repository.deleteById(id);
        return "CustomerMembership with ID + " + id + " deleted";
    }
}
