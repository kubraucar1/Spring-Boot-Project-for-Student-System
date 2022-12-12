package com.student.system.controller;

import com.student.system.model.Student;
import com.student.system.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @DeleteMapping("/delete/{id}")
    public  String deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return "student has been deleted!";
    }

    @GetMapping("/getAll")
    public List<Student> getAll(){
        return (List<Student>) studentService.getAll();
    }

    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable int id,Student student){

        return studentService.updateStudent(id,student);

    }
    @GetMapping("/random")
    public Student randomStudent(){
       var result= studentService.randomStudent();
       return result;
    }
}
