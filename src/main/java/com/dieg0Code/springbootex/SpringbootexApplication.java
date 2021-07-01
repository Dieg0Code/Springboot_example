package com.dieg0Code.springbootex;

import com.dieg0Code.springbootex.student.Student;
import org.apache.tomcat.jni.Local;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController // make this class to serve rest endpoints
public class SpringbootexApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootexApplication.class, args);
    }

    @GetMapping
    public List<Student> hello() {
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
