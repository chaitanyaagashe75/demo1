package com.example.demo1.controller;

import com.example.demo1.model.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class EmployeeController {

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return null;
    }
}
