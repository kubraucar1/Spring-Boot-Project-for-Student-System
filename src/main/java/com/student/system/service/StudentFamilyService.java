package com.student.system.service;

import com.student.system.model.Student;
import com.student.system.model.StudentFamily;
import com.student.system.repository.IStudentFamilyRepository;
import com.student.system.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentFamilyService implements IStudentFamilyService{
    @Autowired
    private IStudentFamilyRepository studentFamilyRepository;
    private IStudentRepository studentRepository;

    @Override
    public StudentFamily addFamily(int id, StudentFamily studentFamily) {

        if(studentRepository.findById(id).isPresent()){

            return studentFamilyRepository.save(studentFamily);

        }
        else {
            throw new RuntimeException("there is not a student like this");
        }
    }

    @Override
    public List<StudentFamily> getAll() {
        return studentFamilyRepository.findAll();
    }
}
