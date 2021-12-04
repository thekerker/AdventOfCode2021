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

    public int getSlidingWindowIncreases(List<Integer> measurements) {
        int count = 0;

        int currentSum = measurements.get(0) + measurements.get(1) + measurements.get(2);

        for (int i = 1; i < measurements.size(); i++) {
            if (i + 2 < measurements.size()) {
                int newSum = measurements.get(i) + measurements.get(i + 1) + measurements.get(i + 2);
                if (newSum > currentSum) {
                    count++;
                }
                currentSum = newSum;
            }
        }

        return count;
    }
}
