package com.backend.java_mysql_curd_api.controller;

import com.backend.java_mysql_curd_api.models.Student;
import com.backend.java_mysql_curd_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController{

    @Autowired
    private StudentService studentService;

    // END POINT TO FETCH ALL STUDENT
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping(value = "/allStudents")
    public List<Student> findAllStudents(){
        return studentService.getAllStudents();
    }

    // END POINT TO FETCH SINGLE STUDENT
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping(value = "/findStudent/{id}")
    public Optional<Student> findStudentById(@PathVariable(value = "id") int student_id){
        return studentService.getStudentById(student_id);
    }

    // END POINT TO ADD NEW STUDENT
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "/addStudent")
    public void addNewEmployee(@RequestBody Student studentObj){
        studentService.addNewStudent(studentObj);
    }

    // END POINT TO UPDATE A STUDENT
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping(value = "/updateStudent")
    public void updateNewEmployee(@RequestBody Student studentObj){
        studentService.updateStudentById(studentObj);
    }

    // END POINT TO DELETE A STUDENT
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping(value = "/deleteStudent")
    public void deleteNewStudent(@RequestBody Student studentObj){
        studentService.deleteStudent(studentObj);
    }
}
