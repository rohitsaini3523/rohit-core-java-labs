package com.deloitte.lab4.ex3;

public abstract class MediaItem extends Item {

    int runTime;

    public MediaItem(int uniqueIdentification, String title, int numOfCopies, int runTime) {
        super(uniqueIdentification, title, numOfCopies);
        this.runTime = runTime;
    }

    @Override
    public String toString() {
        return "MediaItem [runTime=" + runTime + ", getUniqueIdentification()=" + getUniqueIdentification()
                + ", getTitle()=" + getTitle() + ", getNumOfCopies()=" + getNumOfCopies() + "]";
    }

}
