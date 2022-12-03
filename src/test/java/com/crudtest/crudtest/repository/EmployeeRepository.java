package com.crudtest.crudtest.repository;

import com.crudtest.crudtest.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
