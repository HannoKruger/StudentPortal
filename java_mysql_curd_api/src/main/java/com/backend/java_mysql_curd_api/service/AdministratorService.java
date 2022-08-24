package com.backend.java_mysql_curd_api.service;

import com.backend.java_mysql_curd_api.models.Administrator;
import com.backend.java_mysql_curd_api.repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministratorService {
    @Autowired
    private AdministratorRepository administratorRepository;

    // FETCHING ALL EMPLOYEE DATA
    public List<Administrator> getAllAdmins(){
        return administratorRepository.findAll();
    }

    // FETCHING EMPLOYEE BY ID
    public Optional<Administrator> getAdminById(int Admin_id){
        return administratorRepository.findById(Admin_id);
    }

    // ADD NEW EMPLOYEE
    public void addNewAdmin(Administrator adminObj){
        administratorRepository.save(adminObj);
    }

    // DELETING EMPLOYEE BY ID
    public void deleteAdminById(Administrator adminObj){
        administratorRepository.deleteById(adminObj.getId());
    }

    // UPDATING EMPLOYEE BY ID
    public void updateAdminById(Administrator adminObj){
        administratorRepository.save(adminObj);
    }

}
