package com.example.atlantts.config;

import com.example.atlantts.entity.Employee;
import com.example.atlantts.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InitData {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void start() {
        List<Employee> res = employeeRepository.findAll();
        employeeRepository.save(new Employee("first", "last", "ee@gmail.com"));
    }
}
