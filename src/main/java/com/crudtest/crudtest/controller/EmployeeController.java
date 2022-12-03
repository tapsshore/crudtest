package com.crudtest.crudtest.controller;

import com.crudtest.crudtest.domain.Employee;
import com.crudtest.crudtest.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createEmployee(@RequestBody Employee employee) throws Exception {
        return employeeService.saveEmployee(employee);
    }
}
