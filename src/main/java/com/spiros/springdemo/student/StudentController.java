package com.spiros.springdemo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Spiros",
                        "Vatikiotis",
                        LocalDate.now(),
                        "spirosfwiw@gmail.com",
                        41),
                new Student(
                        "Vaggos",
                        "Mixalakeas",
                        LocalDate.now(),
                        "psionicv@hotmail.com",
                        42
                )

        );
    }
}
