package ru.netology.javaqa.hwop.services;

public class Radio {
    public int currentVolume;



    public void setToMaxVol() {
        currentVolume = 100;
    }

    public void setToMinVol() {
        currentVolume = 0;
    }

    public void increaseVolume() {
            currentVolume = currentVolume + 1;
    }

    public void decreaseVolume() {
            currentVolume = currentVolume - 1;

    }

    public void fullUpVolume() {
        currentChannel = 100;

    }

    public void fullDownVolume() {
            currentChannel = 0;

    }


    public int currentChannel;


    public void setToMaxChan() {
        currentChannel = 9;
    }

    public void setToMinChan() {
        currentChannel = 0;
    }


    public void increaseChannel() {

            currentChannel = currentChannel + 1;

    }

    public void decreaseChannel() {
        currentChannel = currentChannel - 1;
    }

    public void fullUpChannel() {
        currentChannel = 0;
    }

    public void fullDownChannel() {
            currentChannel = 9;
    }


}