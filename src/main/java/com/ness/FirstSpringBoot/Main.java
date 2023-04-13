// Main.java
package com.ness.FirstSpringBoot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ness.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		// initialize Spring context
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ness");
		context.refresh();

		// get employee service bean
		EmployeeService employeeService = context.getBean(EmployeeService.class);

		// print all employees
		employeeService.printAllEmployees();

		// get employee name by ID
		Integer employeeId = 1;
		String employeeName = employeeService.getEmployeeNameById(employeeId);
		System.out.println("Employee name for ID " + employeeId + ": " + employeeName);

		// close Spring context
		context.close();
	}
}