package com.spring.project.service;

import com.spring.project.model.Customer;
import com.spring.project.model.Room;
import com.spring.project.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public List<Customer> getAll(){return customerRepository.findAll();}

    public Optional<Customer> getCustomerById(String customerId){return customerRepository.findById(customerId);}

    public void deleteCustomerById(String customerId){customerRepository.deleteById(customerId);}

    public Customer postCustomer(Customer customer){return customerRepository.save(customer);}

    public Customer patchCustomerById(Room room, String customerId){return customerRepository.updateRoom(room,customerId);}
}
