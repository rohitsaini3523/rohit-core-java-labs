package com.deloitte.lab4.ex2.service;

import com.deloitte.lab4.ex2.bean.Employee;

public interface EmployeeService {
	Employee getEmployeeDetails();

	String findInsuranceSchema(double salary, String designation);

	String displayEmployeeDetails(Employee emp);
}
