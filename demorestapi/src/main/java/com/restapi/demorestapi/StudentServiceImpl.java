package com.restapi.demorestapi;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
 private StudentRepository studentRepo;

    @Override
    public List<Student> fetchStudentList() {
        return  (List<Student>)  
        studentRepo.findAll();

    }

    @Override
    public Student saveStudent(Student student) {
     return studentRepo.save(student);
    }

    @Override
    public Student updateStudent(Student student, Long studentRollNumber) {
        Student studdb=studentRepo.findById(studentRollNumber).get();
        if(Objects.nonNull(studdb.getStudentName())&& !" ".equalsIgnoreCase(studdb.getStudentName()))
        {
            studdb.setStudentName(student.getStudentName());
        }
        if (Objects.nonNull(studdb.getStudentAddress())&& !"" .equalsIgnoreCase(studdb.getStudentAddress()))
            {
                studdb.setStudentAddress(studdb.getStudentAddress());
            }
studdb.setStudentAge(student.getStudentAge())  ;
studdb.setStudentSubjects(student.getStudentSubjects());
return studentRepo.save(studdb);
}

    @Override
    public void deleteStudentRollNoById(Long StudentRollNumber ){
        // TODO Auto-generated method stub
               studentRepo.deleteById(StudentRollNumber);

    }
}