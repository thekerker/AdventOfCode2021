package com.thekerker.day3.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerConsumptionCheckerTest {
    private PowerConsumptionChecker pcc;

    private List<String> readings;

    @BeforeEach
    public void setupTests() {
        pcc = new PowerConsumptionChecker();

        readings = new ArrayList<>();
        readings.add("00100");
        readings.add("11110");
        readings.add("10110");
        readings.add("10111");
        readings.add("10101");
        readings.add("01111");
        readings.add("00111");
        readings.add("11100");
        readings.add("10000");
        readings.add("11001");
        readings.add("00010");
        readings.add("01010");
    }

    @Test
    public void shouldGetPowerConsumption() {
        int expected = 198;

        int actual = pcc.getPowerConsumption(readings);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetLifeSupportRating() {
        int expected = 230;

        int actual = pcc.getLifeSupportRating(readings);

        assertEquals(expected, actual);
    }
}
