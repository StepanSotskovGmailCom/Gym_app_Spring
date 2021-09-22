package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.CustomerType;
import com.javariga.gym_app.repository.CustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
@RestController
@RequestMapping(value = "/customerType", produces = APPLICATION_JSON_VALUE)

public class CustomerTypeController {

    private final CustomerTypeRepository repository;

    @Autowired
    public CustomerTypeController(CustomerTypeRepository repository) {
        this.repository = repository;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public CustomerType create(@RequestBody CustomerType request) {
        return repository.save(request);
    }

    @GetMapping
    public CustomerType get(@RequestParam Long id) {
        return repository.findById(id).get();
    }

    @PutMapping
    public CustomerType update(@RequestBody CustomerType request) {
        return repository.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        repository.deleteById(id);
        return "CustomerType with ID + " + id + " deleted";
    }

}
