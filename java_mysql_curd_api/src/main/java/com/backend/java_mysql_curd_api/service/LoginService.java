package com.backend.java_mysql_curd_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.java_mysql_curd_api.models.Administrator;
import com.backend.java_mysql_curd_api.models.Student;
import com.backend.java_mysql_curd_api.models.User;

@Service
public class LoginService {
    @Autowired
    private AdministratorService as;

    @Autowired
    private StudentService ss;

    public User login(String userName, String password) {

        List<Student> students = ss.getAllStudents();
        List<Administrator> administrators = as.getAllAdmins();

        for (Administrator administrator : administrators) {
            if (administrator.getName().equals(userName) & administrator.getPassword().equals(password)) {
                
                return new User(administrator.getName(), administrator.getPassword(), "admin");
                
            }
        }

        for (Student student : students) {
            if (student.getStudent_Email().equals(userName) & student.getStudent_Password().equals(password)) {
                return new User(student.getStudent_Email(), student.getStudent_Password(), "student");
            }
        }

        return null;
    }
}
