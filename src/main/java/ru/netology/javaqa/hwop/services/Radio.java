package ru.netology.javaqa.hwop.services;

public class Radio {
    public int currentVolume;

    public void setToMaxVol() {
        currentVolume = 100;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void fullUpVolume() {
        if (currentChannel == 100) {
        }
    }

    public void fullDownVolume() {
        if (currentVolume == 0) {
            currentChannel = 0;
        }
    }


    public int currentChannel;

    public void setToMaxChan() {
        currentChannel = 9;
    }


    public void increaseChannel() {
        if (currentChannel < 9) {
            currentChannel = currentChannel + 1;
        }
    }

    public void decreaseChannel() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        }
    }

    public void fullUpChannel() {
        if (currentChannel == 9) {
            currentChannel = 0;
        }
    }

    public void fullDownChannel() {
        if (currentChannel == 0) {
            currentChannel = 9;
        }
    }


}