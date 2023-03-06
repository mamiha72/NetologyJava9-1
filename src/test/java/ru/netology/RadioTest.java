package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {


    @ParameterizedTest
    // @CsvFileSource(files = "src/test/resources/stationset") File [src/test/resources/stationset] could not be read
    @CsvSource({
            "0,-1",
            "0,0",
            "1,1",
            "5,5",
            "8,8",
            "9,9",
            "9,10"
    })

    public void stationSetFullTest(int expected, int newValue) {
        Radio station = new Radio();
        station.setCurrentStation(newValue);

        int actual = Radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,-1",
            "0,0",
            "1,1",
            "5,5",
            "9,9",
            "10,10",
            "10,11"
    })

    public void volumeSetFullTest(int expected, int newValue) {
        Radio volume = new Radio();
        volume.setCurrentVolume(newValue);

        int actual = Radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "6,5",
            "9,8",
            "0,9"
    })

    public void nextStationFullTest(int expected, int nextValue) {
        Radio station = new Radio();
        station.setCurrentStation(nextValue);

        station.next();

        int actual = Radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "5,6",
            "0,1",
            "9,0"
    })

    public void prevStationFullTest(int expected, int prevValue) {
        Radio station = new Radio();
        station.setCurrentStation(prevValue);

        station.prev();

        int actual = Radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "6,5",
            "9,8",
            "9,9"
    })
    public void volumeUpFullTest(int expected, int upValue) {
        Radio volume = new Radio();
        volume.setCurrentVolume(upValue);

        volume.volumeUp();

        // int expected = 6;
        int actual = Radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "5,6",
            "0,1",
            "0,0"
    })
    public void volumeDownFullTest(int expected, int downValue) {
        Radio volume = new Radio();
        volume.setCurrentVolume(downValue);

        volume.volumeDown();

        //int expected = 4;
        int actual = Radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}