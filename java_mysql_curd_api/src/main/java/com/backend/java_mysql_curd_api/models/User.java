package com.backend.java_mysql_curd_api.models;

public class User {
    int id;
    String name;
    String username;
    String type;
    String contact;
    String address;
    String password;

    public User(int id, String name, String username, String type, String contact, String address, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.type = type;
        this.contact = contact;
        this.address = address;
        this.password = password;
    }

    public User() {
    }   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
