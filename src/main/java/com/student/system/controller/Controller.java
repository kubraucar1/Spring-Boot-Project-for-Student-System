package com.student.system.controller;

import com.student.system.model.Student;
import com.student.system.repository.IStudentRepository;
import com.student.system.response.ApiRespone;
import com.student.system.service.IStudentService;
import com.student.system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/student")
public class Controller {
    @Autowired
    private IStudentService studentService;
    @Autowired
    private IStudentRepository studentRepository;
    @Autowired
    private StudentService studentServiceImpl;


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

    @GetMapping("/pagination/{page}/{pageSize}")
    public ApiRespone<Page<Student>> getUsersWithPaginationAndSorting(@PathVariable int page, @PathVariable int pageSize ){
        Page<Student>  students =  studentServiceImpl.findusersWithPagination(page,pageSize);
        return new ApiRespone<>(students.getSize(), students);
    }
}
