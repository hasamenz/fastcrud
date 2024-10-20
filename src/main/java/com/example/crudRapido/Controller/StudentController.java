package com.example.crudRapido.Controller;

import com.example.crudRapido.Service.StudentService;
import com.example.crudRapido.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student>getAll(){
        return studentService.getStudents();
    }

    @PostMapping
    public void saveUpdate(@RequestBody Student student){
         studentService.saveOrUpdate(student);
    }

    @DeleteMapping("/{studentId}")
    public void deleteById(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);
    }

    @GetMapping("/{studentId}")
    public Optional<Student> getById(@PathVariable("studentId") Long studentId){
        return studentService.getStudent(studentId);
    }
    // linea agregada

}
