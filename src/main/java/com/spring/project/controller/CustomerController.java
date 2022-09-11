package com.spring.project.controller;

import com.spring.project.model.Customer;
import com.spring.project.model.Room;
import com.spring.project.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAll(){
        return customerService.getAll();
    }
    @GetMapping("/customers/{customerId}")
    public Optional<Customer> getCustomerById(@PathVariable String customerId){
        return customerService.getCustomerById(customerId);
    }

    @DeleteMapping("/customers/{customerId}")
    public void deleteCustomerById(@PathVariable String customerId){
        customerService.deleteCustomerById(customerId);
    }

    @PostMapping("/customers")
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.postCustomer(customer);
    }

    @PatchMapping("/customers/{customerId}")
    @Transactional
    public Customer updateCustomerRoom(@PathVariable String customerId,@RequestBody Room room){
        return customerService.patchCustomerById(room,customerId);
    }
}
