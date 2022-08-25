package com.sap.scholar.springdemo.service;

import com.sap.scholar.springdemo.model.Employee;
import com.sap.scholar.springdemo.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(final Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeByName(final String name){
        return employeeRepository.getEmployeeByName(name);
    }
}
