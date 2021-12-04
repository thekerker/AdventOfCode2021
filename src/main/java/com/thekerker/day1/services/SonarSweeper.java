package com.thekerker.day1.services;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class SonarSweeper {

    public int getDepthIncreases(List<Integer> measurements) {
        int count = 0;

        int currentMeasurement = measurements.get(0);

        for (int i = 1; i < measurements.size(); i++) {
            Integer measurement = measurements.get(i);
            if (measurement > currentMeasurement) {
                count++;
            }
            currentMeasurement = measurement;
        }

        return count;
    }
}
