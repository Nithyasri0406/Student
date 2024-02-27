package com.example.studentdetail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentdetail.entity.Student;

public interface StudentRespository extends JpaRepository <Student ,Integer>{

	

}
