package org.example.controller;

import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class UserController<Employee> {

    @Autowired
    private UserService employeeService;

    @PostMapping
    public <Employee> Employee createEmployee(@RequestBody Employee employee) {
        return (Employee) UserService.createEmployee(employee);
    }

    @GetMapping
    public List<Employee> findAllEmployees() {
        return employeeService.findAllEmployees();
    }
}
