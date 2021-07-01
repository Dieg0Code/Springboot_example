package com.dieg0Code.springbootex.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

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
