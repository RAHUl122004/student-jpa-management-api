package com.springbootdemo.student_jpa_api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DepartmentController {
    private DepartmentRepository repository;

    public DepartmentController(DepartmentRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/department")
    public Department addDepartment(@RequestBody Department department) {
        return repository.save(department);
    }

    @GetMapping("/departments")
    public List<Department> getDepartments() {
        return repository.findAll();
    }
}
