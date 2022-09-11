package com.spring.project.controller;

import com.spring.project.model.Employee;
import com.spring.project.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }
    @GetMapping("/employees/{employeeID}")
    public Optional<Employee> getEmployeeById(@PathVariable String employeeID){
        return employeeService.getEmployeeById(employeeID);
    }

    @DeleteMapping("/employees/{employeeID}")
    public void deleteEmployeeById(@PathVariable String employeeID){
        employeeService.deleteEmployeeById(employeeID);
    }

    @PutMapping("/employees")
    public Employee saveOne(@RequestBody Employee toCreate){
        return employeeService.saveOne(toCreate);
    }
}
