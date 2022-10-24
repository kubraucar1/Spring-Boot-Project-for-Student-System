package com.student.system.controller;

import com.student.system.model.Student;
import com.student.system.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Controller {
    @Autowired
    private IStudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody  Student student){
        studentService.saveStudent(student);
        return "student has been added";
    }
}
