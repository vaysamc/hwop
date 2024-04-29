package ru.netology.javaqa.hwop.services;

public class Radio {
    private int currentVolume;

    private int currentChannel;

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

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < 0) {
            newCurrentChannel = 9;
        }
        if (newCurrentChannel > 9) {
            newCurrentChannel = 0;
        }
        currentChannel = newCurrentChannel;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

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


}