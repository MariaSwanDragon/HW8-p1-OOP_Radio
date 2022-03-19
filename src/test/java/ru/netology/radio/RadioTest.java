package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldSetQuantityChannel() {
        Radio radio = new Radio(30);
        assertEquals(30, radio.getChannelsQuantity());

    }

    @Test
    public void shouldSetQuantityChannelDefault() {
        Radio radio = new Radio();
        assertEquals(10, radio.getChannelsQuantity());

    }

    //Номер текущей радиостанции изменяется в пределах от 0 до количества радиостанций, указанных при создании (см. п.1)
//    Клиент должен иметь возможность выставлять номер радиостанции с цифрового пульта (вводя числа 0 - количество станций)
    @Test
    void shouldSetCurrentChannelWithCustomQuantity() {
        Radio radio = new Radio(50);
        radio.setCurrentChannel(30);
        assertEquals(30, radio.getCurrentChannel());
    }

    @Test
    void shouldSetCurrentChannelWithCustomQuantityOver() {
        Radio radio = new Radio(50);
        radio.setCurrentChannel(60);
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void shouldSetCurrentChannelWithCustomQuantity2() {
        Radio radio = new Radio(50);
        radio.setCurrentChannel(48);
        assertEquals(48, radio.getCurrentChannel());
    }

    @Test
    void shouldSetCurrentChannelWithCustomQuantityBelow() {
        Radio radio = new Radio(50);
        radio.setCurrentChannel(-1);
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void shouldSetNextChannelWithCustomQuantity() {
        Radio radio = new Radio(50);
        radio.setCurrentChannel(23);
        radio.increaseChannel();

        assertEquals(24, radio.getCurrentChannel());
    }

    @Test
    void shouldSetNextChannelWithCustomQuantityOverMax() {
        Radio radio = new Radio(50);
        radio.setCurrentChannel(49);
        radio.increaseChannel();

        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void shouldSetPrevChannelWithCustomQuantity() {
        Radio radio = new Radio(40);
        radio.setCurrentChannel(24);
        radio.prevChannel();

        assertEquals(23, radio.getCurrentChannel());
    }

    @Test
    void shouldSetPrevChannelWithCustomQuantityBelowMin() {
        Radio radio = new Radio(30);
        radio.setCurrentChannel(0);
        radio.prevChannel();

        assertEquals(29, radio.getCurrentChannel());
    }

    @Test
    void shouldSetPrevChannelWithDefaultQuantity() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.prevChannel();

        assertEquals(9, radio.getCurrentChannel());
    }


    @Test
    void shouldSetNextChannelWithDefaultQuantity() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.increaseChannel();

        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void volumeIncrease() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.increaseVolume();

        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void volumeIncreaseMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void volumeOverMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    public void volumeLower() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.prevVolume();

        assertEquals(98, radio.getCurrentVolume());
    }

    @Test
    public void volumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.prevVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void currentVolumeOverMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void currentVolumeOverMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

}
