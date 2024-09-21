package com.deloitte.lab9.ex4;

import java.util.function.Supplier;

public class InstanceDemo {
    public static void main(String[] args) {
        Supplier<Person> person = () -> new Person("Rohit Saini", 22);
        System.out.println(person.get());
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

}
