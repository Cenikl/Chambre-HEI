package com.spring.project.controller;

import com.spring.project.model.Manager;
import com.spring.project.service.ManagerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin
public class ManagerController {

    private final ManagerService managerService;

    @GetMapping("/managers")
    public List<Manager> getAll(){
        return managerService.getAll();
    }
    @GetMapping("/managers/{managerID}")
    public Optional<Manager> getManagerById(@PathVariable String managerID){
        return managerService.getManagerById(managerID);
    }
    @PutMapping("/managers")
    public Manager createOrUpdateManager(@RequestBody Manager manager){
        return managerService.saveOne(manager);
    }
}
