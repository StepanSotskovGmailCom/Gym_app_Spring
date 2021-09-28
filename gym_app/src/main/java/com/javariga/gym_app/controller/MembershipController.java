package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.Membership;
import com.javariga.gym_app.services.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping( "/membership")
public class MembershipController {
    private final MembershipService service;

    @Autowired
    public MembershipController(MembershipService service) {
        this.service = service;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Membership create(@RequestBody Membership request) {
        return service.save(request);
    }

    @GetMapping
    public Membership get(@RequestParam Long id) {
        return service.findById(id).get();
    }

    @PutMapping
    public Membership update(@RequestBody Membership request) {
        return service.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        service.deleteById(id);
        return "Membership with ID + " + id + " deleted";
    }
}
