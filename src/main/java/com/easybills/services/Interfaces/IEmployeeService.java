package com.easybills.services.Interfaces;

import com.easybills.domain.Employee;
import com.easybills.domain.Role;
import com.easybills.repository.IEmployeeRepository;

import java.util.List;

public interface IEmployeeService  {

    List<Employee> listAll();

    void save(Employee employee);

    Employee findById(int id);

    void deleteById(int id);

    void update(Employee employee);

}
