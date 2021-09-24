package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.Perk;
import com.javariga.gym_app.repository.PerkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
@RestController
@RequestMapping(value = "/perk", produces = APPLICATION_JSON_VALUE)

public class PerkController {

    private final PerkRepository repository;

    @Autowired
    public PerkController(PerkRepository repository) {
        this.repository = repository;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Perk create(@RequestBody Perk request) {
        return repository.save(request);
    }

    @GetMapping
    public Perk get(@RequestParam Long id) {
        return repository.findById(id).get();
    }

    @PutMapping
    public Perk update(@RequestBody Perk request) {
        return repository.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        repository.deleteById(id);
        return "Perk with ID + " + id + " deleted";
    }

}
