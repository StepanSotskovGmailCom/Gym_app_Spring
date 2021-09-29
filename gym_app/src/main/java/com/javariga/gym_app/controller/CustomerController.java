package com.javariga.gym_app.controller;


import com.javariga.gym_app.services.CustomerService;
import com.javariga.gym_app.entities.Customer;
import com.javariga.gym_app.repository.CustomerRepository;
//import com.javariga.gym_app.service.CustomerDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

import static org.springframework.http.ResponseEntity.ok;

@RequiredArgsConstructor

@Controller
@RequestMapping( "/customer")
public class CustomerController {


    private final CustomerService customerService;
//    private final CustomerDetailsService customerDetailsService;


    @GetMapping("/add_customer")
    public String addNewCustomer(@ModelAttribute("customer") Customer customer) {
//        Customer customer = new Customer();
        return "customers/add_customer";
    }
    @PostMapping()
    public String saveCustomer(@ModelAttribute("customer") @Valid Customer customer,
                               BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "customers/add_customer";
        customerService.saveCustomer(customer);
        return "redirect:/customer";
    }

    @GetMapping
    public String getAllCustomers(Model model) {
        model.addAttribute("all_customers", customerService.findAll());
        return "customers/customer";
    }
//    @GetMapping("/new")
//    public String newCustomer(@ModelAttribute("customer") Customer customer) {
//        return "customers/new";
//    }

    @GetMapping("/edit/{id}")
    public String editCustomer(Model model, @PathVariable("id") long id) {
        Optional<Customer> customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "customers/edit_customer";
    }
    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable(value = "id") Long id,Model model) {
        System.out.println(id);
//        var note = customerService.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("customer"));
        customerService.deleteById(id);
        model.addAttribute("customer", customerService.findAll());
        return "redirect:/customer";
    }
}
