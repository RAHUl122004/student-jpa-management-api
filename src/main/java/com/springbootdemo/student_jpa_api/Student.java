package com.springbootdemo.student_jpa_api;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


    @Entity
    @Table(name = "students")
public class Student {

     @Id
   
    
    private int id;
    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Min(value = 0, message = "Marks cannot be less than 0")
    @Max(value = 100, message = "Marks cannot be greater than 100")
    private int marks;

    public Student() {
    }

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
  
    @ManyToOne
    @JoinColumn(name = "department_id")
private Department department;

    public Department getDepartment() {
    return department;
}

public void setDepartment(Department department) {
    this.department = department;
}

}

