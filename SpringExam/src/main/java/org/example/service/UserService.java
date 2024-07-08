package org.example.service;

import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService<Employee> {

    @Autowired
    private UserRepository employeeRepository;

    public static Employee createEmployee(Employee employee) {
        return (Employee) employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }
}
