package com.deloitte.lab9.ex6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import com.deloitte.lab3.ex9.DateDifference;

public class EmployeeRepository {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Rohit", "Saini", "rohitsaini3523@gmail.com", "9568000766",
                LocalDate.of(2020, 5, 15),
                "Developer", 10.0, 10, new Department(1, "Backend", 10));

        Employee emp2 = new Employee(102, "Aditi", "Sharma", "aditisharma123@gmail.com", "9876005432",
                LocalDate.of(2019, 3, 22),
                "Designer", 9.5, 9, new Department(2, "Frontend", 8));

        Employee emp3 = new Employee(103, "Vikram", "Singh", "vikramsingh987@gmail.com", "9856008765",
                LocalDate.of(2021, 7, 10),
                "Tester", 8.5, 8, new Department(3, "QA", 5));

        Employee emp4 = new Employee(104, "Neha", "Verma", "neha.verma456@gmail.com", "9642002345",
                LocalDate.of(2018, 11, 5),
                "Project Manager", 12.0, 12, new Department(4, "Management", 15));

        Employee emp5 = new Employee(105, "Rahul", "Kumar", "rahulkumar234@gmail.com", "9657009876",
                LocalDate.of(2022, 1, 20),
                "DevOps Engineer", 11.0, 11, new Department(1, "Backend", 10));

        Employee emp6 = new Employee(106, "Pooja", "Rai", "poojarai345@gmail.com", "9512006789",
                LocalDate.of(2020, 9, 30),
                "Data Scientist", 13.0, 13, new Department(5, "Data Science", 20));

        Employee emp7 = new Employee(107, "Suresh", "Patel", "sureshpatel678@gmail.com", "9332004567",
                LocalDate.of(2017, 12, 18),
                "System Analyst", 10.5, 10, new Department(6, "Analysis", 10));

        Employee emp8 = new Employee(108, "Anjali", "Iyer", "anjaliiyer789@gmail.com", "9803008765",
                LocalDate.of(2021, 4, 11),
                "Database Administrator", 9.0, 9, new Department(7, "Database", 7));

        Employee emp9 = new Employee(109, "Karan", "Bansal", "karanbansal890@gmail.com", "9564001234",
                LocalDate.of(2019, 8, 25),
                "Network Engineer", 10.0, 10, new Department(8, "Network", 6));

        Employee emp10 = new Employee(110, "Meera", "Chopra", "meerachopra901@gmail.com", "9843005678",
                LocalDate.of(2020, 6, 14),
                "Product Owner", 11.5, 11, new Department(4, "Management", 15));

        Employee emp11 = new Employee(111, "Monu", "Chopra", "monuchopra901@gmail.com", "9843005678",
                LocalDate.of(2020, 6, 14),
                "Product Owner", 11.5, 11,new Department());

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);
        empList.add(emp7);
        empList.add(emp8);
        empList.add(emp9);
        empList.add(emp10);
        empList.add(emp11);
        // salarySum(empList);
        // departmentCount(empList);
        // seniorMostEmployee(empList);
        employeeDuration(empList);

    }

    public static void employeeDuration(List<Employee> empList) {
        empList.stream().map(
                emp -> {
                    return emp.getFirstName() + " -> "
                            + DateDifference.calculateDifference(emp.getHireData().toString());
                }).collect(Collectors.toList()).forEach(s -> System.out.print(s));
    }

    public static void seniorMostEmployee(List<Employee> empList) {
        System.out.println(empList.stream().min(Comparator.comparing(Employee::getHireData)));
    }

    public static void departmentCount(List<Employee> empList) {
        empList.stream()
                .collect(Collectors.groupingBy(emp -> emp.getDepartment().getDepartmentName(), Collectors.counting()))
                .forEach((department, totalEmp) -> {
                    System.out.println(department + " -> " + totalEmp);
                });
        ;
    }

    public static void salarySum(List<Employee> empList) {
        double totalSalary = empList.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("Total Salary: " + totalSalary);
    }

}
