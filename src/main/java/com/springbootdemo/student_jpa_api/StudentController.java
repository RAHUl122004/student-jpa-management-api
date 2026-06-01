package com.springbootdemo.student_jpa_api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;


@RestController
public class StudentController {
    
    private StudentService service;



    public StudentController(StudentService service) {
    this.service = service;
}

   @GetMapping("/students")
public List<Student> getStudents() {
    return service.getAllStudents();
}

@PostMapping("/student")
public Student addStudent(@Valid @RequestBody Student student) {
    return service.addStudent(student);
}

@GetMapping("/student/{id}")
public Student getStudentById(@PathVariable int id) {
    return service.getStudentById(id);
}

@PutMapping("/student")
public Student updateStudent(@Valid @RequestBody Student student) {
    return service.addStudent(student);
}

@DeleteMapping("/student/{id}")
public String deleteStudent(@PathVariable int id) {
    service.deleteStudent(id);
    return "Student Deleted";
}
@GetMapping("/department/{departmentId}/students")
public List<Student> getStudentsByDepartment(@PathVariable int departmentId) {
    return service.getStudentsByDepartment(departmentId);
}

@GetMapping("/students/marks/{marks}")
public List<Student> getStudentsByMarks(@PathVariable int marks) {
    return service.getStudentsByMarks(marks);
}

@GetMapping("/studentdto/{id}")
public StudentResponseDTO getStudentDTO(@PathVariable int id) {
    return service.getStudentDTO(id);
}

}
