package com.student.system.controller;

import com.student.system.model.Student;
import com.student.system.repository.IStudentRepository;
import com.student.system.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class Controller {
    @Autowired
    private IStudentService studentService;
    @Autowired
    private IStudentRepository studentRepository;


    @GetMapping("/get")
    public List<Student> getAll(){
        List<Student> allStudents = studentService.getAllStudents();
        return allStudents;
    }
    @PostMapping("/add")
    public String addStudent(@RequestBody  Student student){
        studentService.saveStudent(student);
        return "student has been added";
    }
    @DeleteMapping("/delete/{id}")
    public  String deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return "student has been deleted!";
    }


    @GetMapping("/random")
    public Student randomStudent(){
        Student selectedStudentByRandom = studentService.randomStudent();
        return selectedStudentByRandom;
    }
}
