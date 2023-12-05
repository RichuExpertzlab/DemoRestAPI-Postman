package com.restapi.demorestapi;

import java.util.List;
public interface StudentService {
    
        List <Student> fetchStudentList();
        Student saveStudent(Student student);
        Student updateStudent(Student student,Long studentRollNumber);
        void deleteStudentRollNoById(Long StudentRollNumber);
    
}
