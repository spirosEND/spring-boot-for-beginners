package com.spiros.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

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
                ),

                new Student(
                        "George",
                        "Antipatis",
                        LocalDate.now(),
                        "georgeantipatis@hotmail.com",
                        41
                ),

                new Student(
                        "Mike",
                        "Mixalakeas",
                        LocalDate.now(),
                        "mikemixalakeas@hotmail.com",
                        39
                ),
                new Student(
                        "John",
                        "Vodinos",
                        LocalDate.now(),
                        "johnvodinos@hotmail.com",
                        45
                )
        );
    }
}
