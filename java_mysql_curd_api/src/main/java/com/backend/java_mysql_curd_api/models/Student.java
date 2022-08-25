package com.backend.java_mysql_curd_api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long student_id;

    private String student_name;
    private String student_address;
    private String student_email;
    private String student_password;


    public Long getStudent_Id() {
        return student_id;
    }

    public void setId(Long student_id) {
        this.student_id = student_id;
    }

    public String getStduent_Name() {
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

    public void Employee(){}

    public void Employee(Long student_id, String student_name, String student_address, String student_email, String student_password) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_address = student_address;
        this.student_email = student_email;
        this.student_password = student_password;
    }
}