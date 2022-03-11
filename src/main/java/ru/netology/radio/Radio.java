package ru.netology.radio;


public class Radio {
    private int currentChannel;
    private int currentVolume;


    public Radio() {
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setToMaxChannel() {
        currentChannel = 9;
    }

    public void setToMinChannel() {
        currentChannel = 0;
    }

    public void nextChannel() {
        if (currentChannel < 9) {
            currentChannel = currentChannel + 1;
            return;
        }
        this.currentChannel = 0;
    }

    public void prevChannel() {
        if (currentChannel > 1) {
            currentChannel = currentChannel - 1;
        }
        if (currentChannel == 0) {
            this.currentChannel = 9;
        }
    }

    public void setCurrentChannel(int CurrentChannel) {
        if (CurrentChannel > 9) {
            return;
        }
        if (CurrentChannel < 0) {
            return;
        }
        this.currentChannel = CurrentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume > 10) {
            return;
        }
        if (CurrentVolume < 0) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }
}
