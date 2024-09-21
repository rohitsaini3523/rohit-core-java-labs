package com.deloitte.lab4.ex3;

// unique identification number, title, and number of copies
public abstract class Item {
    private int uniqueIdentification;
    private String title;
    private int numOfCopies;

    public Item(int uniqueIdentification, String title, int numOfCopies) {
        this.uniqueIdentification = uniqueIdentification;
        this.title = title;
        this.numOfCopies = numOfCopies;
    }

    public void checkIn() {
        this.numOfCopies++;
    }

    public boolean checkOut() {
        if (this.numOfCopies > 0) {
            this.numOfCopies--;
            return true;
        }
        return false;
    }

    public void addItem(){
        
    }

    public int getUniqueIdentification() {
        return uniqueIdentification;
    }

    public void setUniqueIdentification(int uniqueIdentification) {
        this.uniqueIdentification = uniqueIdentification;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }

    @Override
    public String toString() {
        return "Item [uniqueIdentification=" + uniqueIdentification + ", title=" + title + ", numOfCopies="
                + numOfCopies + "]";
    }

}
