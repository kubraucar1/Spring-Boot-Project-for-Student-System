package com.student.system.service;

import com.student.system.model.Student;
import com.student.system.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collections;
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
    public Page<Student> findusersWithPagination(int page, int pageSize) {
        Page<Student> students = studentRepository.findAll(PageRequest.of(page, pageSize));
        return students;
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
            studentExist.setStudentFamily(student.getStudentFamily());

            Student student1 = studentRepository.save(studentExist);
            return new Student(student1.getStudentId(), student1.getStudentSurname(), student1.getStudentAddress(),
                    student1.getStudentPhoneNumber(), student1.getStudentEmail(),student1.getStudentFamily());
        }
        else
            return student;

    }

    @Override
    public List<Student> getStudents() {
        List<Student> getAllStudents = studentRepository.getStudents();
        return getAllStudents;
    }

    @Override
    public Student randomStudent() {
        List<Student> allStudents =  studentRepository.findAll();
        Random random = new Random();
        Student selectedStudent=allStudents.get(random.nextInt(allStudents.size()));
        return selectedStudent;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> allStudents= studentRepository.findAll();
        return allStudents;
    }


}
