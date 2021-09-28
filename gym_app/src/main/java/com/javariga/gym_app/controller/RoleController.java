package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.Role;
import com.javariga.gym_app.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/role")
public class RoleController {

    private final RoleService service;

    @Autowired
    public RoleController(RoleService service) {
        this.service = service;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Role create(@RequestBody Role request) {
        return service.save(request);
    }

    @GetMapping
    public Role get(@RequestParam Long id) {
        return service.findById(id).get();
    }

    @PutMapping
    public Role update(@RequestBody Role request) {
        return service.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        service.deleteById(id);
        return "Role with ID + " + id + " deleted";
    }
}
