package com.backend.java_mysql_curd_api.controller;

import com.backend.java_mysql_curd_api.models.Register;
import com.backend.java_mysql_curd_api.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RegisterController{

    @Autowired
    private RegisterService registerService;

    // END POINT TO FETCH ALL REGISTER
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping(value = "/allRegisters")
    public List<Register> findAllRegisters(){
        return registerService.getAllRegisters();
    }

    // END POINT TO FETCH SINGLE REGISTER
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping(value = "/findRegister/{id}")
    public Optional<Register> findRegisterById(@PathVariable(value = "id") int register_id){
        return registerService.getRegisterById(register_id);
    }

    // END POINT TO ADD NEW REGISTER
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping(value = "/addRegister")
    public void addNewRegister(@RequestBody Register registerObj){
        registerService.addNewRegister(registerObj);
    }

    // END POINT TO UPDATE A REGISTER
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping(value = "/updateRegister")
    public void updateNewEmployee(@RequestBody Register registerObj){
        registerService.updateRegisterById(registerObj);
    }

    // END POINT TO DELETE A REGISTER
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping(value = "/deleteRegister")
    public void deleteNewStudent(@RequestBody Register registerObj){
        registerService.deleteRegister(registerObj);
    }
}
