package com.backend.java_mysql_curd_api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int register_id;

    private int student_id;
    private String student_name;
    private String student_address;
    private String student_email;
    private String student_password;
    private String course_name;

    public int getRegister_Id() {
        return register_id;
    }

    public void setRegister_Id(int register_id) {
        this.register_id = register_id;
    }

    public int getStudent_Id() {
        return student_id;
    }

    public void setStudent_Id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_Name() {
        return student_name;
    }

    public void setStudent_Name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_Address() {
        return student_address;
    }

    public void setStudent_Address(String student_address) {
        this.student_address = student_address;
    }

    public String getStudent_Email() {
        return student_email;
    }

    public void setStudent_Email(String student_email) {
        this.student_email = student_email;
    }

    public String getStudent_Password() {
        return student_password;
    }

    public void setStudent_Password(String student_password) {
        this.student_password = student_password;
    }

    public String getCourse_Name() {
        return course_name;
    }

    public void setCourse_Name(String course_name) {
        this.course_name = course_name;
    }

    public Register(){}

    public Register(int course_id, int student_id, String student_name, String student_address, String student_email, String student_password, String course_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_address = student_address;
        this.student_email = student_email;
        this.student_password = student_password;
        this.course_name = course_name;
    }
}