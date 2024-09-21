package com.deloitte.lab4.ex2.service;

import java.util.Scanner;

import com.deloitte.lab4.ex2.bean.Employee;

public class EmployeeInsuranceServices implements EmployeeService {
	Scanner scanner = new Scanner(System.in);

	@Override
	public Employee getEmployeeDetails() {
		System.out.print("Enter Employee ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Employee Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter Employee Salary: ");
		double salary = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter Employee Designation: ");
		String designation = scanner.nextLine();
		String insuranceScheme = findInsuranceSchema(salary, designation);
		return new Employee(id, name, salary, designation, insuranceScheme);
	}

	@Override
	public String displayEmployeeDetails(Employee emp) {
		return "Employee [id=" + emp.getId() + ", name=" + emp.getName() + ", salary=" + emp.getSalary()
				+ ", designation=" + emp.getDesignation() + ", insuranceScheme=" + emp.getInsuranceScheme() + "]";
	}

	@Override
	public String findInsuranceSchema(double salary, String designation) {
		if (salary < 1000000.00 && designation.equals("Analyst")) {
			return "Insurance A";
		}
		return "Insurance B";
	}

}
