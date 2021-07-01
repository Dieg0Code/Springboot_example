package com.dieg0Code.springbootex.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController // make this class to serve rest endpoints
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Diego",
                        "dieg0.code@email.com",
                        LocalDate.of(1996, Month.FEBRUARY, 2),
                        25

                )
        );
    }
}
