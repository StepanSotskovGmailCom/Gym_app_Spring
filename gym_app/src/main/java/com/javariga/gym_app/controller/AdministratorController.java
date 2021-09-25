package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.Administrator;
import com.javariga.gym_app.repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@Controller
@RequestMapping( "/admin")

public class AdministratorController {

    private final AdministratorRepository repository;

    @Autowired
    public AdministratorController(AdministratorRepository repository) {
        this.repository = repository;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Administrator create(@RequestBody Administrator request) {
        return repository.save(request);
    }

    @GetMapping
    public Administrator get(@RequestParam Long id) {
        return repository.findById(id).get();
    }

    @PutMapping
    public Administrator update(@RequestBody Administrator request) {
        return repository.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        repository.deleteById(id);
        return "Administrator with ID + " + id + " deleted";
    }
}
