package com.student.system.service;

import com.student.system.model.Student;
import com.student.system.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;

import java.util.List;

@Service
public class StudentService implements IStudentService{
    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public Student saveStudent( Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);

    }

    @Override
    public List<Student> getAll() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student updateStudent(int id,Student student) {

        student = studentRepository.findStudentById(id);

        return studentRepository.save(student);
    }

    @Override
    public Student randomStudent() {
        List<Student> allStudent = (List<Student>) studentRepository.findAll();
        Random random= new Random();
        var selectedStudent = allStudent.get(random.nextInt(allStudent.size()));
        return selectedStudent;
    }


}
