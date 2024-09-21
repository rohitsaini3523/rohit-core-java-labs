package com.deloitte.lab4.ex3;

public class JournalPaper extends WrittenItem {

    int yearPublished;

    public JournalPaper(int uniqueIdentification, String title, int numOfCopies, String author, int yearPublished) {
        super(uniqueIdentification, title, numOfCopies, author);
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "JournalPaper [yearPublished=" + yearPublished + ", author=" + author + ", getUniqueIdentification()="
                + getUniqueIdentification() + ", getTitle()=" + getTitle() + ", getNumOfCopies()=" + getNumOfCopies()
                + "]";
    }

}
