package com.university.info.student_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.university.info.student_service.Entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
