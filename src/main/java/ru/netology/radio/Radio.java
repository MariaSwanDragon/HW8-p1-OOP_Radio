package ru.netology.radio;


public class Radio {
    private int currentChannel;
    private int currentVolume;
    private final int minChannel = 0;
    private final int maxChannel = 9;
    private final int minVolume = 0;
    private final int maxVolume = 10;


    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            return;
        }
        if (currentChannel < minChannel) {
            return;
        }
        this.currentChannel = currentChannel;
    }


    public void nextChannel() {
        if (currentChannel == maxChannel) {
            currentChannel = minChannel;
            return;
        }
        currentChannel++;
    }

    public void prevChannel() {
        if (currentChannel == minChannel) {
            currentChannel = maxChannel;
            return;
        }
        currentChannel--;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentVolume() {
        if (currentVolume < maxVolume)
            currentVolume++;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume > minVolume)
            currentVolume--;
    }
}
