package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.AdministratorRole;
import com.javariga.gym_app.services.AdministratorRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/administratorRole")
public class AdministratorRoleController {
    private final AdministratorRoleService service;

    @Autowired
    public AdministratorRoleController(AdministratorRoleService service) {
        this.service = service;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public AdministratorRole create(@RequestBody AdministratorRole request) {
        return service.save(request);
    }

    @GetMapping
    public AdministratorRole get(@RequestParam Long id) {
        return service.findById(id).get();
    }

    @PutMapping
    public AdministratorRole update(@RequestBody AdministratorRole request) {
        return service.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        service.deleteById(id);
        return "AdministratorRole with ID + " + id + " deleted";
    }
}
