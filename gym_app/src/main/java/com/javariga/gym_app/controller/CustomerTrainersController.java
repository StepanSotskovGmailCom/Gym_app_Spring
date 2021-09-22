package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.CustomerTrainers;
import com.javariga.gym_app.repository.CustomerTrainersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/customerTrainers", produces = APPLICATION_JSON_VALUE)
public class CustomerTrainersController {

    private final CustomerTrainersRepository repository;

    @Autowired
    public CustomerTrainersController(CustomerTrainersRepository repository) {
        this.repository = repository;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public CustomerTrainers create(@RequestBody CustomerTrainers request) {
        return repository.save(request);
    }

    @GetMapping
    public CustomerTrainers get(@RequestParam Long id) {
        return repository.findById(id).get();
    }

    @PutMapping
    public CustomerTrainers update(@RequestBody CustomerTrainers request) {
        return repository.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        repository.deleteById(id);
        return "CustomerTrainers with ID + " + id + " deleted";
    }
}
