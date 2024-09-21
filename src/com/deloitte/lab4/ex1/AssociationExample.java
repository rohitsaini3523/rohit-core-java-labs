package com.deloitte.lab4.ex1;

public class AssociationExample {
    public static void main(String[] args) {
        Person p1 = new Person("smith", 20);
        Person p2 = new Person("Kathy", 20);
        Account acc1 = new Account(2000, p1);
        Account acc2 = new Account(3000, p2);
        acc1.deposit(2000);
        acc2.withdraw(2000);
        System.out.println("Account Balance for smith: " + acc1.getBalance());
        System.out.println("Account Balance for Kathy: " + acc2.getBalance());

    }
}

class Account {
    long accNum;
    double balance;
    Person accHolder;

    public Account(double balance, Person accHolder) {
        this.accNum = (long) (Math.random() * 100000);
        this.balance = balance;
        this.accHolder = accHolder;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public void withdraw(double balance) {
        this.balance -= balance;
    }

    public long getAccNum() {
        return accNum;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(Person accHolder) {
        this.accHolder = accHolder;
    }

}

class SavingAccount extends Account {
    final double minBalance = 500;

    public SavingAccount(double balance, Person accHolder) {
        super(balance, accHolder);
    }

    @Override
    public void withdraw(double balance) {
        if (super.getBalance() > 500) {
            super.withdraw(balance);
        } else {
            System.out.println("Minimum Balance 500 required!");
        }
    }

}

class CurrentAccount extends Account {
    double overdraftLimit;

    public CurrentAccount(double balance, Person accHolder) {
        super(balance, accHolder);
    }

    @Override
    public void withdraw(double balance) {
        if (overdraftLimit < 1000) {
            super.withdraw(balance);
        } else {
            System.out.println("Overdraft limit reached!");
        }
    }

}

class Person {
    String name;
    float age;

    public Person(String name, float age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }
}
