package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.TrainerRole;
import com.javariga.gym_app.services.TrainerRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping( "/trainerRole")

public class TrainerRoleController {
    private final TrainerRoleService service;

    @Autowired
    public TrainerRoleController(TrainerRoleService service) {
        this.service = service;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public TrainerRole create(@RequestBody TrainerRole request) {
        return service.save(request);
    }

    @GetMapping
    public TrainerRole get(@RequestParam Long id) {
        return service.findById(id).get();
    }

    @PutMapping
    public TrainerRole update(@RequestBody TrainerRole request) {
        return service.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        service.deleteById(id);
        return "TrainerRole with ID + " + id + " deleted";
    }
}
