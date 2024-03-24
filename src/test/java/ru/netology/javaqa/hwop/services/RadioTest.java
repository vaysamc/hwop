package ru.netology.javaqa.hwop.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 93;
        int expected = 93;
        int actual = volume.currentVolume;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetChannel() {
        Radio channel = new Radio();
        channel.currentChannel = 5;
        int expected = 5;
        int actual = channel.currentChannel;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaxChannel() {
        Radio channel = new Radio();
        channel.setToMaxChan();
        int expected = 9;
        int actual = channel.currentChannel;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaxVolume() {
        Radio volume = new Radio();
        volume.setToMaxVol();
        int expected = 100;
        int actual = volume.currentVolume;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void upVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 23;
        volume.increaseVolume();

        int expected = 24;
        int actual = volume.currentVolume;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void downVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 23;
        volume.decreaseVolume();

        int expected = 22;
        int actual = volume.currentVolume;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void upChannel() {
        Radio channel = new Radio();
        channel.currentChannel = 5;
        channel.increaseChannel();

        int expected = 6;
        int actual = channel.currentChannel;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void downChannel() {
        Radio channel = new Radio();
        channel.currentChannel = 5;
        channel.decreaseChannel();

        int expected = 4;
        int actual = channel.currentChannel;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void fullDownChannel() {
        Radio channel = new Radio();
        channel.currentChannel = 0;
        channel.fullDownChannel();

        int expected = 9;
        int actual = channel.currentChannel;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void fullUpChannel() {
        Radio channel = new Radio();
        channel.currentChannel = 9;
        channel.fullUpChannel();

        int expected = 0;
        int actual = channel.currentChannel;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void fullDownVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 0;
        volume.fullDownVolume();

        int expected = 0;
        int actual = volume.currentVolume;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void fullUpVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 100;
        volume.fullUpVolume();

        int expected = 100;
        int actual = volume.currentVolume;
        Assertions.assertEquals(expected, actual);

    }


}
