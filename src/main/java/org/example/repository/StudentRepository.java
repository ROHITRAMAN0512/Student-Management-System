package org.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
