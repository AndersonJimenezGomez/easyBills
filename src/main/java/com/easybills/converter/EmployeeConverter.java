package com.easybills.converter;

import com.easybills.domain.Employee;
import com.easybills.entity.EmployeeEntity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeConverter {




    public Employee entityToModel(EmployeeEntity employeeEntity) {
        Employee employee;
        if(employeeEntity == null) {
            employee = null;
        }
        else {
            employee = new Employee (employeeEntity.getIdEmployee(),employeeEntity.getName(), employeeEntity.getLastName(),employeeEntity.getPassword(), employeeEntity.getRole());
        }
        return employee;
    }

    public EmployeeEntity modelToEntity(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setIdEmployee(employee.getIdEmployee());
        employeeEntity.setName(employee.getName());
        employeeEntity.setLastName(employee.getLastName());
        employeeEntity.setPassword(employee.getPassword());
        employeeEntity.setRole(employee.getRole());
        return employeeEntity;
    }

    public List<Employee> entityToModel(List<EmployeeEntity> employeeEntityList) {
        List<Employee> employeeList = new ArrayList<Employee>(employeeEntityList.size());
        employeeEntityList.forEach((entity) -> {
            employeeList.add(entityToModel(entity));
        });
        return employeeList;
    }
}
