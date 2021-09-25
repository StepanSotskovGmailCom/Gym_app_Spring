package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.CustomerTrainer;
import com.javariga.gym_app.repository.CustomerTrainersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
@Controller
@RequestMapping("/customerTrainers")
public class CustomerTrainersController {

    private final CustomerTrainersRepository repository;

    @Autowired
    public CustomerTrainersController(CustomerTrainersRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public CustomerTrainer create(@RequestBody CustomerTrainer request) {
        return repository.save(request);
    }

    @GetMapping
    public CustomerTrainer get(@RequestParam Long id) {
        return repository.findById(id).get();
    }

    @PutMapping
    public CustomerTrainer update(@RequestBody CustomerTrainer request) {
        return repository.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        repository.deleteById(id);
        return "CustomerTrainers with ID + " + id + " deleted";
    }
}
