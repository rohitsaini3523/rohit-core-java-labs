package com.deloitte.lab4.ex2.pl;

import com.deloitte.lab4.ex2.bean.Employee;
import com.deloitte.lab4.ex2.service.EmployeeInsuranceServices;

public class EmployeeInput {

	public static void main(String[] args) {

		EmployeeInsuranceServices empServices = new EmployeeInsuranceServices();
		Employee emp = empServices.getEmployeeDetails();
		System.out.println(empServices.displayEmployeeDetails(emp));
	}

}
