package com.backend.java_mysql_curd_api.service;

import com.backend.java_mysql_curd_api.models.Register;
import com.backend.java_mysql_curd_api.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegisterService {

    @Autowired
    private RegisterRepository registerRepository;


    // FETCHING ALL REGISTER DATA
    public List<Register> getAllRegisters(){
        return registerRepository.findAll();
    }

    // FETCHING REGISTER BY ID
    public Optional<Register> getRegisterById(int register_id){
        return registerRepository.findById(register_id);
    }

    // ADD NEW REGISTER
    public void addNewRegister(Register registerObj){
        registerRepository.save(registerObj);
    }

    // DELETING REGISTER BY ID
    public void deleteRegister(Register registerObj){
        registerRepository.deleteById(registerObj.getRegister_Id());
    }

    // UPDATING REGISTER BY ID
    public void updateRegisterById(Register registerObj){
        registerRepository.save(registerObj);
    }
}
