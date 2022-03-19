package ru.netology.radio;


public class Radio {
    private int currentChannel;
    private int channelsQuantity = 10;
    private int volume;
    private int volumeMax = 100;
    private int volumeMin = 0;



    //конструкторы по умолчанию и с количеством радиостанций
    public Radio() {
    }


    public Radio(int channelsQuantity) {
        this.channelsQuantity = channelsQuantity;
    }


    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > (channelsQuantity - 1)) {
            return;
        }
        if (currentChannel < 0) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getChannelsQuantity() {
        return channelsQuantity;
    }

    public void increaseChannel() {

        if (currentChannel == (channelsQuantity - 1)) {
            setCurrentChannel(0);
            return;
        }
        setCurrentChannel(++currentChannel);

    }

    public void prevChannel() {

        if (currentChannel == 0) {
            setCurrentChannel(channelsQuantity - 1);
            return;
        }
        setCurrentChannel(--currentChannel);

    }

    public int getCurrentVolume() {
        return volume;
    }

    public void setCurrentVolume(int volume) {
        if (volume > volumeMax) {
            return;
        }
        if (volume < volumeMin) {
            return;
        }
        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume < volumeMax) {
            volume = volume + 1;
        }
    }

    public void prevVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
