package com.deloitte.lab4.ex3;

public class Video extends MediaItem {

    String director;
    String genre;
    int yearReleased;

    public Video(int uniqueIdentification, String title, int numOfCopies, int runTime, String director, String genre,
            int yearReleased) {
        super(uniqueIdentification, title, numOfCopies, runTime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    @Override
    public String toString() {
        return "Video [director=" + director + ", runTime=" + runTime + ", genre=" + genre + ", yearReleased="
                + yearReleased + ", getUniqueIdentification()=" + getUniqueIdentification() + ", getTitle()="
                + getTitle() + ", getNumOfCopies()=" + getNumOfCopies() + "]";
    }

}
