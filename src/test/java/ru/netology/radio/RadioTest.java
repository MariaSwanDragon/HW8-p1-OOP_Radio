package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentChannel() {
        Radio radio = new Radio();
        int expected = 2;
        // Установить станцию 2
        radio.setCurrentChannel(expected);
        // Проверить, что станция 2 теперь текущая
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    void shouldInvalidMinSetCurrentChannel() {
        Radio radio = new Radio();
        int expected = radio.getCurrentChannel();
        // Установить станцию меньше минимальной
        radio.setCurrentChannel(-1);
        // Проверить, что текущая станция не изменилась
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    void shouldInvalidMaxSetCurrentChannel() {
        Radio radio = new Radio();
        int expected = radio.getCurrentChannel();
        // Установить станцию больше максимальной
        radio.setCurrentChannel(10);
        // Проверить, что текущая станция не изменилась
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    void shouldNextRadioChannel() {
        Radio radio = new Radio();
        // Установить станцию 8
        radio.setCurrentChannel(8);
        // Нажать 2 раза next
        radio.nextChannel();
        radio.nextChannel();
        // Ожидаемый результат
        int expected = 0;
        // Проверить, что станция 0 теперь текущая
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    void shouldPrevRadioChannel() {
        Radio radio = new Radio();
        // Установить станцию 1
        radio.setCurrentChannel(1);
        // Нажать 2 раза prev
        radio.prevChannel();
        radio.prevChannel();
        // Ожидаемый результат
        int expected = 9;
        // Проверить, что станция 9 теперь текущая
        assertEquals(expected, radio.getCurrentChannel());
    }

    @Test
    void shouldInvalidMaxSetCurrentVolume() {
        Radio radio = new Radio();
        // Запомнить текущую громкость
        int expected = radio.getCurrentVolume();
        // Установить значение громкости больше максимальной
        radio.setCurrentVolume(11);
        // Проверить, что текущая громкость не изменилась
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldInvalidMinSetCurrentVolume() {
        Radio radio = new Radio();
        // Запомнить текущую громкость
        int expected = radio.getCurrentVolume();
        // Установить значение громкости больше максимальной
        radio.setCurrentVolume(-1);
        // Проверить, что текущая громкость не изменилась
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();
        // Установить текущую громкость
        radio.setCurrentVolume(9);
        // Нажимать кнопку увеличения громкости 2 раза
        radio.increaseCurrentVolume();
        radio.increaseCurrentVolume();
        // Проверить, что громкость равна максимально возможной
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();
        // Установить текущую громкость
        radio.setCurrentVolume(1);
        // Нажимать кнопку уменьшения громкости 2 раза
        radio.decreaseCurrentVolume();
        radio.decreaseCurrentVolume();
        // Проверить, что громкость равна минимально возможной
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }


}
