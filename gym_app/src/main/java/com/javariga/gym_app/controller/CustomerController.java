package com.javariga.gym_app.controller;

import com.javariga.gym_app.entities.Customer;
import com.javariga.gym_app.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/all_customers")
    public String listAllCustomers(Model model) {
        model.addAttribute("all_customers", customerService.findAll());
    return "customer";
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Customer create(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping
    public String getCustomer(Model model) {
        Customer customer = customerService.findById(1L).orElseThrow();
        model.addAttribute("customer", customer);
        return "customer";
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @DeleteMapping
    public String deleteCustomer(@RequestParam Long id) { customerService.deleteById(id);
        return "Customer with ID + " + id + " deleted";
    }


}
