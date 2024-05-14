package ru.netology.javaqa.hwop.services;

public class Radio {
    private int currentVolume;
    private int numberOfStations;
    private int currentChannel;


    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.currentVolume = 0;
        this.currentChannel = 0;
    }

    public Radio() {
        this(10);
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

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

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel >= 0 && newCurrentChannel < numberOfStations) {
            this.currentChannel = newCurrentChannel;
        }
    }

    public void increaseChannel() {
        if (currentChannel >= numberOfStations - 1) {
            currentChannel = 0;
        }else {
            currentChannel = currentChannel + 1;
        }
    }

    public void decreaseChannel() {
        if (currentChannel == 0){
            currentChannel= numberOfStations - 1;
        }else {
            currentChannel--;
        }
    }


    public int getNumberOfStations() {
        return numberOfStations;
    }
}