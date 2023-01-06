package com.example.studentapisb;

import com.example.studentapisb.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class StudentApiSbApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentApiSbApplication.class, args);
    }

    @GetMapping
    @RequestMapping("/")
    public List<Student> sayHello() {
        return List.of(
                new Student(
                        1L,
                        "Luis Mendez",
                        "info@luismendezdev.com",
                        LocalDate.of(2023, Month.JANUARY, 5),
                        21
                )
        );
    }
}
