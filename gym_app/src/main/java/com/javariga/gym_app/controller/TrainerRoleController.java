package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.CustomerPerk;
import com.javariga.gym_app.entities.TrainerRole;
import com.javariga.gym_app.repository.CustomerPerkRepository;
import com.javariga.gym_app.repository.TrainerRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/trainerRole", produces = APPLICATION_JSON_VALUE)

public class TrainerRoleController {
    private final TrainerRoleRepository repository;

    @Autowired
    public TrainerRoleController(TrainerRoleRepository repository) {
        this.repository = repository;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public TrainerRole create(@RequestBody TrainerRole request) {
        return repository.save(request);
    }

    @GetMapping
    public TrainerRole get(@RequestParam Long id) {
        return repository.findById(id).get();
    }

    @PutMapping
    public TrainerRole update(@RequestBody TrainerRole request) {
        return repository.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        repository.deleteById(id);
        return "TrainerRole with ID + " + id + " deleted";
    }
}
