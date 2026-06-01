package com.springbootdemo.student_jpa_api;

public class StudentResponseDTO {
     private int id;
    private String name;
    private String departmentName;

    public StudentResponseDTO() {
    }

    public StudentResponseDTO(int id, String name, String departmentName) {
        this.id = id;
        this.name = name;
        this.departmentName = departmentName;
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

    public String getDepartmentName() {
        return departmentName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
