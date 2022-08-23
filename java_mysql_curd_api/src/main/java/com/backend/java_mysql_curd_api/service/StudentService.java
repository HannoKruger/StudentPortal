package com.backend.java_mysql_curd_api.service;

import com.backend.java_mysql_curd_api.models.Student;
import com.backend.java_mysql_curd_api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    // FETCHING ALL STUDENT DATA
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    // FETCHING STUDENT BY ID
    public Optional<Student> getStudentById(int student_id){
        return studentRepository.findById(student_id);
    }

    // ADD NEW STUDENT
    public void addNewStudent(Student studentObj){
        studentRepository.save(studentObj);
    }

    // DELETING STUDENT BY ID
    public void deleteStudent(Student studentObject){
        studentRepository.deleteById(studentObject.getStudent_Id());
    }

    // UPDATING STUDENT BY ID
    public void updateStudentById(Student studentObject){
        studentRepository.save(studentObject);
    }
}