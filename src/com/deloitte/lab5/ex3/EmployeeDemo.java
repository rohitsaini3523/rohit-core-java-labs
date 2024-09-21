package com.deloitte.lab5.ex3;

import com.deloitte.lab5.ex3.exception.EmployeeException;

public class EmployeeDemo {
    public static void main(String[] args) {
        try {
            Employee emp = new Employee("Sonu", 300.00);
            System.out.println(emp);
        } catch (EmployeeException e) {
            System.out.println("Employee salary less than 3000: EmployeeException Occurred!");
        }
    }
}

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) throws EmployeeException {
        if (salary < 3000) {
            throw new EmployeeException("Salary less than 3000");
        }
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }

}