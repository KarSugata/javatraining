package com.sap.scholar.springdemo.service;

import com.sap.scholar.springdemo.dto.EmployeeResponse;
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

    public EmployeeResponse getEmployeeByName(final String name) {
        Employee employee = employeeRepository.getEmployeeByName(name);
        EmployeeResponse response = new EmployeeResponse();
        response.setName(employee.getName());
        response.setName(employee.getName());
        response.setAge(employee.getAge());
        return response;
    }
}
