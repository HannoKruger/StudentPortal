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

    // FETCHING ALL ADMIN DATA
    public List<Administrator> getAllAdmins(){
        return administratorRepository.findAll();
    }

    // FETCHING ADMIN BY ID
    public Optional<Administrator> getAdminById(int Admin_id){
        return administratorRepository.findById(Admin_id);
    }

    // ADD NEW ADMIN
    public void addNewAdmin(Administrator adminObj){
        administratorRepository.save(adminObj);
    }

    // DELETING ADMIN BY ID
    public void deleteAdminById(Administrator adminObj){
        administratorRepository.deleteById(adminObj.getId());
    }

    // UPDATING ADMIN BY ID
    public void updateAdminById(Administrator adminObj){
        administratorRepository.save(adminObj);
    }

}
