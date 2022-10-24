package com.student.system.service;

import com.student.system.model.Student;
import com.student.system.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService implements IStudentService{
    @Autowired
    private IStudentRepository studentRepository;
    @Override
    public Student saveStudent( Student student) {
        return studentRepository.save(student);
    }
}
