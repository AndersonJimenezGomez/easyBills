package com.easybills.domain;

public class Employee {

    private int idEmployee;
    private String name;
    private String lastName;
    private String password;
    private Role role;


    public Employee(int idEmployee, String name, String lastName, String password, Role role) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.role = role;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
