package com.backend.java_mysql_curd_api.repository;

import com.backend.java_mysql_curd_api.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {//was <Student, Long>
    //Long changed to Integer to match data type in the DB

}