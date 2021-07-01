package com.dieg0Code.springbootex.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student diego = new Student(
                    "Diego",
                    "dieg0.code@email.com",
                    LocalDate.of(1996, Month.FEBRUARY, 2),
                    25
            );

            Student pedro = new Student(
                    "Pedro",
                    "pedro@email.com",
                    LocalDate.of(1997, Month.JANUARY, 5),
                    24
            );

            repository.saveAll(
                    List.of(diego, pedro)
            );
        };
    }
}
