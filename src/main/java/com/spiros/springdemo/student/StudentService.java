package com.spiros.springdemo.student;

import java.util.List;


public interface StudentService {

     Student save(Student s);
     List<Student> findAllStudents();
     Student findByEmail(String email);
     Student updateStudent(Student s);
     void delete(String email);


}