package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.Trainer;
import com.javariga.gym_app.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping("/trainer")
public class TrainerController {

    private final TrainerRepository repository;

    @Autowired
    public TrainerController(TrainerRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Trainer create(@RequestBody Trainer request) {
        return repository.save(request);
    }

    @GetMapping
    public Trainer get(@RequestParam Long id) {
        return repository.findById(id).get();
    }

    @PutMapping
    public Trainer update(@RequestBody Trainer request) {
        return repository.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        repository.deleteById(id);
        return "Trainer with ID + " + id + " deleted";
    }
}
