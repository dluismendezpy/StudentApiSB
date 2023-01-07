package com.example.studentapisb.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student luis = new Student(
                    1L,
                    "Luis",
                    "luis@luismendezdev.com",
                    LocalDate.of(2023, Month.JANUARY, 5)
            );
            Student mendez = new Student(
                    2L,
                    "Mendez",
                    "mendez@luismendezdev.com",
                    LocalDate.of(2023, Month.JANUARY, 5)
            );

            studentRepository.saveAll(List.of(luis, mendez));
        };
    }
}
