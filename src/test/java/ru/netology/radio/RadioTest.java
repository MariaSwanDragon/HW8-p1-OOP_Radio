package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio();

        radio.setCurrentChannel(11);
        int expected = 0;

        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio radio = new Radio();

        radio.setCurrentChannel(-1);
        int expected = 0;

        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void nextChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.nextChannel();

        int expected = 0;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void nextChannel2() {
        Radio radio = new Radio();
        radio.setCurrentChannel(10);
        radio.nextChannel();

        int expected = 1;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void nextChannel3() {
        Radio radio = new Radio();
        radio.setCurrentChannel(7);
        radio.nextChannel();

        int expected = 8;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void prevChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.prevChannel();

        int expected = 8;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void prevChannel2() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.prevChannel();

        int expected = 9;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void MaxChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.setToMaxChannel();

        int expected = 9;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void MaxChannel4() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);
        radio.setToMaxChannel();

        int expected = 9;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void MaxChannel2() {
        Radio radio = new Radio();
        radio.setCurrentChannel(10);
        radio.setToMaxChannel();

        int expected = 9;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void MaxChannel3() {
        Radio radio = new Radio();
        radio.setCurrentChannel(8);
        radio.setToMaxChannel();

        int expected = 9;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void MinChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(8);
        radio.setToMinChannel();

        int expected = 0;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void setToMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setToMaxVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setToMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setToMinVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(20);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    public void moreThanMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.increaseVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void lessThanMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(20);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

}