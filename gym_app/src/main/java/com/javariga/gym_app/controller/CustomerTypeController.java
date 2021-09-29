package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.CustomerType;
import com.javariga.gym_app.services.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping( "/customerType")

public class CustomerTypeController {
    private final CustomerTypeService service;

    @Autowired
    public CustomerTypeController(CustomerTypeService service) {
        this.service = service;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public CustomerType create(@RequestBody CustomerType request) {
        return service.save(request);
    }

    @GetMapping
    public CustomerType get(@RequestParam Long id) {
        return service.findById(id).get();
    }

    @PutMapping
    public CustomerType update(@RequestBody CustomerType request) {
        return service.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        service.deleteById(id);
        return "CustomerType with ID + " + id + " deleted";
    }

}
