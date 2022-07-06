package com.aayush.StudentForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aayush.StudentForm.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>  {

}
