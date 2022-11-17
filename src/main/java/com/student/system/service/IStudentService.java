package com.student.system.service;

import com.student.system.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface IStudentService {
    public Student saveStudent(Student student);
    public void deleteStudent(int id);

    List<Student> getAll();
    Student updateStudent(int id,Student student);



}
