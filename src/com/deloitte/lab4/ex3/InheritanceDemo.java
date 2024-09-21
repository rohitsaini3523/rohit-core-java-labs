package com.deloitte.lab4.ex3;

public class InheritanceDemo {
    public static void main(String[] args) {
        Book book1 = new Book(101, "Dunes", 10, "Frank Herbert");
        System.out.println(book1);
        JournalPaper resPaper = new JournalPaper(105, "Java", 12, "Rohit", 2024);
        System.out.println(resPaper);
        CD cd = new CD(102, "Harry Potter", 10, 3, "Daniel Radcliffe", "Magic");
        System.out.println(cd);
        Video video = new Video(110, "CS50", 1, 10, "MIT", "Education", 2024);
        System.out.println(video);
    }

}
