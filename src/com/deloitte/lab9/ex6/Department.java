package com.deloitte.lab9.ex6;

public class Department {
    int departmentId;
    String departmentName;
    int managerId;

    public Department() {
        this.departmentId = 0;
        this.departmentName = "no-department";
        this.managerId = 0;
    }

    public Department(int departmentId, String departmentName, int managerId) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.managerId = managerId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", managerId="
                + managerId + "]";
    }
}
