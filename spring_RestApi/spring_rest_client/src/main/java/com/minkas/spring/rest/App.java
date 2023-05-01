package com.minkas.spring.rest;

import com.minkas.spring.rest.configuration.MyConfig;
import com.minkas.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);
//        Employee employee = communication.getEmployee(4);
//        System.out.println(employee);
//        Employee employee = new Employee("Sveta", "Sokolova", "IT", 1200);
//        employee.setId(9);
//        communication.saveEmployee(employee);
        communication.deleteEmployee(9);
    }
}
