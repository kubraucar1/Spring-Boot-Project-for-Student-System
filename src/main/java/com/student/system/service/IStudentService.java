package com.student.system.service;

import com.student.system.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentService {
    public Student saveStudent(Student student);
}
