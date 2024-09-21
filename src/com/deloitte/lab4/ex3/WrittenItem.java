package com.deloitte.lab4.ex3;

public abstract class WrittenItem extends Item {

    String author;

    public WrittenItem(int uniqueIdentification, String title, int numOfCopies, String author) {
        super(uniqueIdentification, title, numOfCopies);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "WrittenItem [author=" + author + ", Title=" + getTitle() + ", Number of Copies=" + getNumOfCopies()
                + "]";
    }

}
