package com.thekerker.day1.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SonarSweeperTest {

    private SonarSweeper sonarSweeper;

    @BeforeEach
    public void setupTests() {
        sonarSweeper = new SonarSweeper();
    }

    @Test
    public void shouldGetMeasurements() {
        List<Integer> measurements = new ArrayList<>();
        measurements.add(199);
        measurements.add(200);
        measurements.add(208);
        measurements.add(200);

        int expected = 2;

        int actual = sonarSweeper.getDepthIncreases(measurements);

        assertEquals(expected, actual);
    }
}
