package com.spring.boot.rest.security.employee.dao;

import com.spring.boot.rest.security.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //...
}
