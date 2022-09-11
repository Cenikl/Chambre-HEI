package com.spring.project.service;

import com.spring.project.model.Employee;
import com.spring.project.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getAll(){return employeeRepository.findAll();}

    public Employee saveOne(Employee employee){return employeeRepository.save(employee);}

    public Optional<Employee> getEmployeeById(String employeeId){return employeeRepository.findById(employeeId);}

    public void deleteEmployeeById(String employeeId){employeeRepository.deleteById(employeeId);}


}
