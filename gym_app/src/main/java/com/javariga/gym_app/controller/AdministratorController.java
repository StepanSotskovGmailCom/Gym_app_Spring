package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.Administrator;
import com.javariga.gym_app.services.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping( "/admin")

public class AdministratorController {

    private final AdministratorService service;

    @Autowired
    public AdministratorController(AdministratorService service) {
        this.service = service;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Administrator create(@RequestBody Administrator request) {
        return service.save(request);
    }

    @GetMapping
    public Administrator get(@RequestParam Long id) {
        return service.findById(id).get();
    }

    @PutMapping
    public Administrator update(@RequestBody Administrator request) {
        return service.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        service.deleteById(id);
        return "Administrator with ID + " + id + " deleted";
    }
}
