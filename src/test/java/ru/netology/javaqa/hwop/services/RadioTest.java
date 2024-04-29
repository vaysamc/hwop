package ru.netology.javaqa.hwop.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
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
        Radio channel = new Radio();
        channel.setCurrentChannel(9);
        int expected = 9;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaxChannel() {
        Radio channel = new Radio();
        channel.setCurrentChannel(5);
        channel.setToMaxChan();
        int expected = 9;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void upChannel() {
        Radio channel = new Radio();
        channel.setCurrentChannel(5);
        channel.increaseChannel();

        int expected = 6;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void downChannel() {
        Radio channel = new Radio();
        channel.setCurrentChannel(5);
        channel.decreaseChannel();

        int expected = 4;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void fullDownChannel() {
        Radio channel = new Radio();
        channel.setCurrentChannel(-1);

        int expected = 9;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void fullUpChannel() {
        Radio channel = new Radio();
        channel.setCurrentChannel(10);

        int expected = 0;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setMinChan() {
        Radio channel = new Radio();
        channel.setCurrentVolume(5);
        channel.setToMinChan();

        int expected = 0;
        int actual = channel.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }

}
