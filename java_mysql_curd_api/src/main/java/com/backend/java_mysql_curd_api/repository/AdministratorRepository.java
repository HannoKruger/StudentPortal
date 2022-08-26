package com.backend.java_mysql_curd_api.repository;

import com.backend.java_mysql_curd_api.models.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorRepository extends JpaRepository<Administrator, Integer> {
    
}
