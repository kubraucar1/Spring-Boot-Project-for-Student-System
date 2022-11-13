package com.student.system.service;

import com.student.system.model.Student;
import com.student.system.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Student updateStudent(int id, Student student) {
        if (studentRepository.findById(id).isPresent()) {
            Student studentExist = studentRepository.findById(id).get();
            studentExist.setStudentName(student.getStudentName());
            studentExist.setStudentSurname(student.getStudentSurname());
            studentExist.setStudentAddress(student.getStudentAddress());
            studentExist.setStudentPhoneNumber(student.getStudentPhoneNumber());
            studentExist.setStudentEmail(student.getStudentEmail());

            Student student1 = studentRepository.save(studentExist);
            return new Student(student1.getStudentId(), student1.getStudentSurname(), student1.getStudentAddress(),
                    student1.getStudentPhoneNumber(), student1.getStudentEmail());
        }
        else
            return student;

    }
}

