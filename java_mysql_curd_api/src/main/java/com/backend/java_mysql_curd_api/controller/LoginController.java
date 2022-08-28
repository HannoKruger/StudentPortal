package com.backend.java_mysql_curd_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.backend.java_mysql_curd_api.models.User;
import com.backend.java_mysql_curd_api.service.LoginService;


@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    // END POINT TO AUTHENTICATE USER
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "/login")
    public User login(@RequestBody User user) {
        return loginService.login(user.getUsername(), user.getPassword());
    }
}
