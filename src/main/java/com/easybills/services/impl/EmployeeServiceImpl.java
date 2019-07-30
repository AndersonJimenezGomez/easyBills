package com.easybills.services.impl;

import com.easybills.converter.EmployeeConverter;
import com.easybills.converter.RoleConverter;

import com.easybills.domain.Employee;
import com.easybills.domain.Role;
import com.easybills.repository.IEmployeeRepository;
import com.easybills.repository.IRoleRepository;
import com.easybills.services.Interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService{

    @Autowired
    private IEmployeeRepository employeeRepository;
    @Autowired
    private EmployeeConverter employeeConverter;


    @Override
    public List<Employee> listAll() {
        return employeeConverter.entityToModel(employeeRepository.findAll());
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employeeConverter.modelToEntity(employee));

    }

    @Override
    public Employee findById(int id) {
        return employeeConverter.entityToModel(employeeRepository.findById(id).orElse(null));
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public void update(Employee employee) {
        employeeRepository.save(employeeConverter.modelToEntity(employee));
    }
}
