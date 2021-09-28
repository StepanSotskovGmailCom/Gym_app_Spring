package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.CustomerTrainer;
import com.javariga.gym_app.services.CustomerTrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customerTrainers")
public class CustomerTrainersController {

    private final CustomerTrainerService service;

    @Autowired
    public CustomerTrainersController(CustomerTrainerService service) {
        this.service = service;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public CustomerTrainer create(@RequestBody CustomerTrainer request) {
        return service.save(request);
    }

    @GetMapping
    public CustomerTrainer get(@RequestParam Long id) {
        return service.findById(id).get();
    }

    @PutMapping
    public CustomerTrainer update(@RequestBody CustomerTrainer request) {
        return service.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        service.deleteById(id);
        return "CustomerTrainer with ID + " + id + " deleted";
    }
}
