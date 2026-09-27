package com.example.customer.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public String getCustomerInfo(Long customerId) {
        return "Customer ID: " + customerId;
    }

    public boolean validateCustomer(String email) {
        return email != null && email.contains("@");
    }
}
