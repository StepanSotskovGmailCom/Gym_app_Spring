package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.Role;
import com.javariga.gym_app.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping("/role")
public class RoleController {

    private final RoleRepository repository;

    @Autowired
    public RoleController(RoleRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Role create(@RequestBody Role request) {
        return repository.save(request);
    }

    @GetMapping
    public Role get(@RequestParam Long id) {
        return repository.findById(id).get();
    }

    @PutMapping
    public Role update(@RequestBody Role request) {
        return repository.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        repository.deleteById(id);
        return "Role with ID + " + id + " deleted";
    }
}
