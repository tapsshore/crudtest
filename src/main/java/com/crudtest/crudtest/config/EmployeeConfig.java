package com.crudtest.crudtest.config;

import com.crudtest.crudtest.repository.EmployeeRepository;
import com.crudtest.crudtest.service.EmployeeService;
import com.crudtest.crudtest.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = EmployeeConfig.class)
public class EmployeeConfig {
    @Bean
    public EmployeeService employeeService(EmployeeRepository employeeRepository){
        return new EmployeeServiceImpl( employeeRepository);
    }

}
