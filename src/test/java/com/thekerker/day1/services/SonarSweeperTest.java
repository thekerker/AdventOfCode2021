package com.thekerker.day1.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SonarSweeperTest {

    private SonarSweeper sonarSweeper;

    private List<Integer> measurements;

    @BeforeEach
    public void setupTests() {
        sonarSweeper = new SonarSweeper();

        measurements = new ArrayList<>();
        measurements.add(199);
        measurements.add(200);
        measurements.add(208);
        measurements.add(210);
        measurements.add(200);
        measurements.add(207);
        measurements.add(240);
        measurements.add(269);
        measurements.add(260);
        measurements.add(263);
    }

    @Test
    public void shouldGetMeasurements() {
        int expected = 7;

        int actual = sonarSweeper.getDepthIncreases(measurements);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetSlidingWindowIncreases() {
        int expected = 5;

        int actual = sonarSweeper.getSlidingWindowIncreases(measurements);

        assertEquals(expected, actual);
    }
}
