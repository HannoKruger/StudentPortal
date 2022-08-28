package com.backend.java_mysql_curd_api.repository;

import com.backend.java_mysql_curd_api.models.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Integer> {//was <Register, Long>
    //Long changed to Integer to match data type in the DB
}
