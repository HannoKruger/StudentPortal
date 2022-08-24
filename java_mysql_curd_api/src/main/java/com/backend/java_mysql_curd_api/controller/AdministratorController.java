package com.backend.java_mysql_curd_api.controller;

import com.backend.java_mysql_curd_api.models.Administrator;
import com.backend.java_mysql_curd_api.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdministratorController {
    @Autowired
    private AdministratorService adminService;

    // END POINT TO FETCH ALL EMPLOYEES
    @GetMapping(value = "/allAdmins")
    public List<Administrator> findAllAdmins(){
        return adminService.getAllAdmins();
    }

    // END POINT TO FETCH SINGLE EMPLOYEE
    @GetMapping(value = "/findAdmin/{id}")
    public Optional<Administrator> findAdminById(@PathVariable(value = "id") int adminId){
        return adminService.getAdminById(adminId);
    }

    // END POINT TO ADD NEW EMPLOYEE
    @PostMapping(value = "/addAdmin")
    public void addNewAdmin(@RequestBody Administrator adminObj){
        adminService.addNewAdmin(adminObj);
    }

    // END POINT TO UPDATE AN EMPLOYEE
    @PutMapping(value = "/updateAdmin")
    public void updateNewAdmin(@RequestBody Administrator adminObj){
        adminService.updateAdminById(adminObj);
    }

    // END POINT TO DELETE AN EMPLOYEE
    @DeleteMapping(value = "/deleteAdmin")
    public void deleteNewAdmin(@RequestBody Administrator adminObj){
        adminService.deleteAdminById(adminObj);
    }
}
