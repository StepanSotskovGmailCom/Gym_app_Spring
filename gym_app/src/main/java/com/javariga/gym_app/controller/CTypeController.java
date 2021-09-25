package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.CType;
import com.javariga.gym_app.repository.CTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
@Controller

@RequestMapping("/cType")

public class CTypeController {

    private final CTypeRepository repository;

    @Autowired
    public CTypeController(CTypeRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public CType create(@RequestBody CType request) {
        return repository.save(request);
    }

    @GetMapping
    public CType get(@RequestParam Long id) {
        return repository.findById(id).get();
    }

    @PutMapping
    public CType update(@RequestBody CType request) {
        return repository.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        repository.deleteById(id);
        return "CType with ID + " + id + " deleted";
    }

}
