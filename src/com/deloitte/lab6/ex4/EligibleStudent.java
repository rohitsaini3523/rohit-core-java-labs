package com.deloitte.lab6.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EligibleStudent {
    public static void main(String[] args) {
        HashMap<Integer, Integer> studentsList = new HashMap<>();
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("sonu", 102, 28));
        students.add(new Student("monu", 103, 77));
        students.add(new Student("tonu", 104, 65));
        students.add(new Student("ronu", 105, 80));
        students.add(new Student("rohit", 101, 95));
        studentsList.put(students.get(0).id, students.get(0).marks);
        studentsList.put(students.get(1).id,students.get(1).marks);
        studentsList.put(students.get(2).id,students.get(2).marks);
        studentsList.put(students.get(3).id,students.get(3).marks);
        studentsList.put(students.get(4).id,students.get(4).marks);
        HashMap<Integer, String> eligbleStudent = getStudent(studentsList);
        eligbleStudent.forEach((student, medalType) -> {
            System.out.println(student + " -> " + medalType);
        });
    }

    public static HashMap<Integer, String> getStudent(HashMap<Integer, Integer> students) {
        HashMap<Integer, String> eligibleStudent = new HashMap<>();
        students.forEach((student, studentMarks) -> {
            String medalType = "";
            if (studentMarks > 70) {
                medalType = findMedal(studentMarks);
                eligibleStudent.put(student, medalType);
            }
        });
        return eligibleStudent;
    }

    public static String findMedal(int n) {
        if (n >= 90) {
            return "Gold";
        } else if (n >= 80 && n < 90) {
            return "Silver";
        } else if (n >= 70 && n < 80) {
            return "Bronze";
        }
        return "No-Medal";
    }

}

class Student {
    String name;
    int id;
    int marks;

    public Student(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}