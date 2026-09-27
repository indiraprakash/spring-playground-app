package com.example.webapp.controller;

import com.example.customer.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getCustomer(@PathVariable Long id) {
        return ResponseEntity.ok(customerService.getCustomerInfo(id));
    }

    @PostMapping("/validate")
    public ResponseEntity<Boolean> validateCustomer(@RequestParam String email) {
        return ResponseEntity.ok(customerService.validateCustomer(email));
    }
}