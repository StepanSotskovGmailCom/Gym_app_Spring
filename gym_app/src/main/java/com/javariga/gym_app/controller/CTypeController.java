package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.CType;
import com.javariga.gym_app.services.CTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

@RequestMapping("/cType")

public class CTypeController {

    private final CTypeService service;

    @Autowired
    public CTypeController(CTypeService service) {
        this.service = service;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public CType create(@RequestBody CType request) {
        return service.save(request);
    }

    @GetMapping
    public CType get(@RequestParam Long id) {
        return service.findById(id).get();
    }

    @PutMapping
    public CType update(@RequestBody CType request) {
        return service.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        service.deleteById(id);
        return "CType with ID + " + id + " deleted";
    }

}
