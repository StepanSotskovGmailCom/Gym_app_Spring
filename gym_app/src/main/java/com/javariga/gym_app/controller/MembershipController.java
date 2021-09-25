package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.Membership;
import com.javariga.gym_app.repository.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping( "/membership")
public class MembershipController {
    private final MembershipRepository repository;

    @Autowired
    public MembershipController(MembershipRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Membership create(@RequestBody Membership request) {
        return repository.save(request);
    }

    @GetMapping
    public Membership get(@RequestParam Long id) {
        return repository.findById(id).get();
    }

    @PutMapping
    public Membership update(@RequestBody Membership request) {
        return repository.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        repository.deleteById(id);
        return "Membership with ID + " + id + " deleted";
    }
}
