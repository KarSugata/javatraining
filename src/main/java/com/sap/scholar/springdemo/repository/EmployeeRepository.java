package com.sap.scholar.springdemo.repository;

import com.sap.scholar.springdemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public Employee getEmployeeByName(final String name);
}
