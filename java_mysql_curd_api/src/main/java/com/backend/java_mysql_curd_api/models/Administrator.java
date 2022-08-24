package com.backend.java_mysql_curd_api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Admin_id;

    private String Admin_name;
    private String password;
    private String contact;


    public int getId() {
        return Admin_id;
    }

    public void setId(int Admin_id) {
        this.Admin_id = Admin_id;
    }

    public String getName() {
        return Admin_name;
    }

    public void setName(String Admin_name) {
        this.Admin_name = Admin_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


    public Administrator(){};

    public Administrator(int Admin_id, String Admin_name, String password, String contact) {
        this.Admin_id = Admin_id;
        this.Admin_name = Admin_name;
        this.password = password;
        this.contact = contact;
    }
}
