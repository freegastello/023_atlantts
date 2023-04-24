package com.example.atlantts.config;

import com.example.atlantts.entity.Employee;
import com.example.atlantts.repository.EmployeeRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InitData {
    private EmployeeRepository employeeRepository;

    public void start() {
        List<Employee> res = employeeRepository.findAll();
        System.out.println(" ===> " + res);
        employeeRepository.save(new Employee("first", "last", "ee@gmail.com"));
    }
}
