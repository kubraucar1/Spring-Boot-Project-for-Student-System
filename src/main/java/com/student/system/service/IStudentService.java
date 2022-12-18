package com.student.system.service;

import com.student.system.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface IStudentService {
    public Student saveStudent(Student student);
    public void deleteStudent(int id);


    Student updateStudent(int id,Student student);


    List<Student> getStudents();

    Student randomStudent();
    List<Student> getAllStudents();




}
