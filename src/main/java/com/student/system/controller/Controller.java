package com.student.system.controller;

import com.student.system.model.Student;
import com.student.system.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

//there are two different update verison
    @PutMapping(value = "/update/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Student> updateStudent(@PathVariable(value = "id") int id,
                                                 @RequestBody Student student){
        return new ResponseEntity<>(studentService.updateStudent(id,student),HttpStatus.OK);
    }

    @PutMapping(value = "/update2/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public String  updateStudent2(@PathVariable(value = "id") int id,
                                  @RequestBody Student student){
        studentService.updateStudent(id,student);
        return "Student has been updated";
    }

}
