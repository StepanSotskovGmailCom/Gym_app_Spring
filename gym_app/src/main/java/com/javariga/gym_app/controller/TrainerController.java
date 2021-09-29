package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.Trainer;
import com.javariga.gym_app.services.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/trainer")
public class TrainerController {

    private final TrainerService service;

    @Autowired
    public TrainerController(TrainerService service) {
        this.service = service;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Trainer create(@RequestBody Trainer request) {
        return service.save(request);
    }

    @GetMapping
    public Trainer get(@RequestParam Long id) {
        return service.findById(id).get();
    }

    @PutMapping
    public Trainer update(@RequestBody Trainer request) {
        return service.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        service.deleteById(id);
        return "Trainer with ID + " + id + " deleted";
    }
}
