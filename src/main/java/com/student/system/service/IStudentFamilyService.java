package com.student.system.service;

import com.student.system.model.Student;
import com.student.system.model.StudentFamily;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentFamilyService {
    public StudentFamily addFamily(int id,StudentFamily studentFamily);
    public List<StudentFamily> getAll();
}
