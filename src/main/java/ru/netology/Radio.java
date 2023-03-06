package ru.netology;

public class Radio {
    private static int currentStation;
    private static int currentVolume;

    public static int getCurrentStation() {

        return currentStation;
    }

    public static int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public void volumeUp() {
        if (currentVolume < 9) {
            currentVolume++;
        } else {
            return;
        }
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            return;
        }
    }
}
