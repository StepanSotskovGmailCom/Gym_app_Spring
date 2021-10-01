package com.javariga.gym_app.controller;


import com.javariga.gym_app.entities.Customer;
import com.javariga.gym_app.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor

@Controller
@RequestMapping("/customer")
public class CustomerController {


    private final CustomerService customerService;


    @GetMapping("/add_customer")
    public String addNewCustomer(@ModelAttribute("customer") Customer customer) {
        return "customers/add_customer";
    }

    @PostMapping()
    public String saveCustomer(@ModelAttribute("customer") @Valid Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "customers/add_customer";
        customerService.saveCustomer(customer);
        return "redirect:/customer";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable("id") long id) {
        model.addAttribute("customer", customerService.findById(id));
        return "customers/edit_customer";
    }

    @PostMapping("/edit")
    public String updateCustomer(@ModelAttribute("customer") @Valid Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "customers/edit_customer";
        customerService.saveCustomer(customer);
        return "redirect:/customer";
    }


    @GetMapping
    public String getAllCustomers(Model model) {
        model.addAttribute("all_customers", customerService.findAll());
        return "customers/customer";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable(value = "id") Long id, Model model) {
        System.out.println(id);
        customerService.deleteById(id);
        model.addAttribute("customer", customerService.findAll());
        return "redirect:/customer";
    }
}
