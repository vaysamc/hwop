package ru.netology.javaqa.hwop.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testDefault() {
        Radio radio= new Radio();
        Assertions.assertEquals(10, radio.getNumberOfStations());
        Assertions.assertEquals(0, radio.getCurrentChannel());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testCastom() {
        Radio radio= new Radio(28);
        Assertions.assertEquals(28, radio.getNumberOfStations());
        Assertions.assertEquals(0, radio.getCurrentChannel());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(90);
        int expected = 90;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaxVolume() {
        Radio volume = new Radio();
        volume.setToMaxVol();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void upVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(23);
        volume.increaseVolume();

        int expected = 24;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void downVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(23);
        volume.decreaseVolume();

        int expected = 22;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void fullDownVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-5);

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void fullUpVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(105);

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setMinVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(56);
        volume.setToMinVol();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldSetChannel() {
        Radio channel = new Radio(25);
        channel.setCurrentChannel(23);
        int expected = 23;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void upChannel() {
        Radio channel = new Radio(10);
        channel.setCurrentChannel(3);
        channel.increaseChannel();

        int expected = 4;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void downChannel() {
        Radio channel = new Radio(10);
        channel.setCurrentChannel(5);
        channel.decreaseChannel();

        int expected = 4;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void fullUpChannel() {
        Radio channel = new Radio(35);
        channel.setCurrentChannel(34);
        channel.increaseChannel();

        int expected = 0;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void fullDownChannel() {
        Radio channel = new Radio(35);
        channel.setCurrentChannel(0);
        channel.decreaseChannel();

        int expected = 34;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverMaxChannel() {
        Radio channel = new Radio(25);
        channel.setCurrentChannel(25);
        int expected = 0;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testCurrentChannel() {
        Radio channel = new Radio(10);
        channel.setCurrentChannel(5);
        channel.setCurrentChannel(-5);
        Assertions.assertEquals(5, channel.getCurrentChannel());
    }



}
