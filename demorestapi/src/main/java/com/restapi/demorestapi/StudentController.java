package com.restapi.demorestapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/students")
    public Student saveDepartment(@Validated @RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }
    @GetMapping("/students")
    public List<Student> fetchStudentList()
    {
        return studentService.fetchStudentList();
    }
    @PutMapping("/students/{rollnumber}")
    @GetMapping("/students")
    public Student updateStudent(@RequestBody Student student,@PathVariable("rollnumber")Long StudentRollNumber)
    {
        return studentService.updateStudent(student, StudentRollNumber);
    }
    @DeleteMapping("/students/{rollnumber}")
    public String deleteStudentRollNumberById(@PathVariable("rollnumber")long studentRollNumber)
    
    {
        return "Deleted Successfully";
    }
    
}
