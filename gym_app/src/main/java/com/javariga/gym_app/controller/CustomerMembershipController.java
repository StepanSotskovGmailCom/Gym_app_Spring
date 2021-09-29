package com.javariga.gym_app.controller;


import com.javariga.gym_app.entities.CustomerMembership;
import com.javariga.gym_app.services.CustomerMembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/customerMembership")

public class CustomerMembershipController {

    private final CustomerMembershipService service;

    @Autowired
    public CustomerMembershipController(CustomerMembershipService service) {
        this.service = service;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public CustomerMembership create(@RequestBody CustomerMembership request) {
        return service.save(request);
    }

    @GetMapping
    public CustomerMembership get(@RequestParam Long id) {
        return service.findById(id).get();
    }

    @PutMapping
    public CustomerMembership update(@RequestBody CustomerMembership request) {
        return service.save(request);
    }

    @DeleteMapping
    public String delete(@RequestParam Long id) {
        service.deleteById(id);
        return "CustomerMembership with ID + " + id + " deleted";
    }
}
