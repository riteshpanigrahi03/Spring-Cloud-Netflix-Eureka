package com.servicediscovery.CompanyService;

public class Employee {
    private String name;
    private int age;
    private String designation;
    private int yearsOfExperience;

    public Employee(String name, int age, String designation, int yearsOfExperience) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.yearsOfExperience = yearsOfExperience;
    }
    public Employee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
