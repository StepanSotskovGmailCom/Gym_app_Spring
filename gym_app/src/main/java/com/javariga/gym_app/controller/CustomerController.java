package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.Customer;
import com.javariga.gym_app.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/customer", produces = APPLICATION_JSON_VALUE)
public class CustomerController {


    private final CustomerRepository repository;

    @Autowired
    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }


    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Customer create(@RequestBody Customer customer) {
        return repository.save(customer);
    }

    @GetMapping
    public Customer getCustomer(@RequestParam Long id) {
        return repository.findById(id).get();
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer) {
        return repository.save(customer);
    }

    @DeleteMapping
    public String deleteCustomer (@RequestParam Long id) {
        repository.deleteById(id);
        return "Customer with ID + " + id + " deleted";
    }


}
