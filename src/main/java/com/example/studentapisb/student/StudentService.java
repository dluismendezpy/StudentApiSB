package com.example.studentapisb.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
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
