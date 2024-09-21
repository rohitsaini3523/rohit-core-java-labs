package com.deloitte.lab4.ex3;

public class CD extends MediaItem {

    String artist;
    String genre;

    public CD(int uniqueIdentification, String title, int numOfCopies, int runTime, String artist, String genre) {
        super(uniqueIdentification, title, numOfCopies, runTime);
        this.artist = artist;
        this.genre = genre;
    }

}
