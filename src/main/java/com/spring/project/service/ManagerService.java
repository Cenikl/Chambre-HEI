package com.spring.project.service;

import com.spring.project.model.Manager;
import com.spring.project.repository.ManagerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ManagerService {
    private final ManagerRepository managerRepository;

    public List<Manager> getAll(){return managerRepository.findAll();}

    public Manager saveOne(Manager manager){return managerRepository.save(manager);}

    public Optional<Manager> getManagerById(String managerId){return managerRepository.findById(managerId);}

}
