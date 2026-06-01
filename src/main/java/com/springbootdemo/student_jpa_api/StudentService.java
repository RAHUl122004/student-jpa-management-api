
package com.springbootdemo.student_jpa_api;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student addStudent(Student student) {
        return repository.save(student);
    }

    public Student getStudentById(int id) {
           return repository.findById(id)
            .orElseThrow(() ->
                new StudentNotFoundException("Student not found"));
    }

    public void deleteStudent(int id) {
        repository.deleteById(id);
    }
    public List<Student> getStudentsByDepartment(int departmentId) {
    return repository.findByDepartmentId(departmentId);
}

  public List<Student> getStudentsByMarks(int marks) {
    return repository.findByMarksGreaterThan(marks);
}


public StudentResponseDTO getStudentDTO(int id) {

    Student student = repository.findById(id).orElse(null);

    if(student == null) {
        return null;
    }

    StudentResponseDTO dto = new StudentResponseDTO();

    dto.setId(student.getId());
    dto.setName(student.getName());
    dto.setDepartmentName(student.getDepartment().getName());

    return dto;
}
}