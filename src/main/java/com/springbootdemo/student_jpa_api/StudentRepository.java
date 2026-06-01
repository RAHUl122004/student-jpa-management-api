package com.springbootdemo.student_jpa_api;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findByDepartmentId(int departmentId);

    List<Student> findByMarksGreaterThan(int marks);
}
