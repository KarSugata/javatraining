package com.sap.scholar.springdemo.repository;

import com.sap.scholar.springdemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee getEmployeeByName(final String name);

    @Query(value = "select e.department from Employee e where e.empId=:empId", nativeQuery = false)
    String getEmployeeDepartmentByEmployeeId(final String empId);
}
