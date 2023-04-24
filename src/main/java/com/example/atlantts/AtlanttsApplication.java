package com.example.atlantts;

import com.example.atlantts.entity.Employee;
import com.example.atlantts.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AtlanttsApplication {
    public static void main(String[] args) {
        SpringApplication.run(AtlanttsApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(EmployeeRepository repository) {
        return (args) -> {
            repository.save(new Employee("Petr", "Ivanov", "gas@mail.ru"));
            repository.save(new Employee("Sava", "Letov", "maz@mail.ru"));
            repository.save(new Employee("Tima", "Sokolov", "pas@mail.ru"));
            repository.save(new Employee("first", "last", "ee@gmail.com"));
        };
    }
}
