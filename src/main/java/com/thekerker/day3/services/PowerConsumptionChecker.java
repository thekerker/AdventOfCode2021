package com.thekerker.day3.services;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class PowerConsumptionChecker {
    public int getPowerConsumption(List<String> readings) {
        StringBuilder gamma = new StringBuilder();
        StringBuilder epsilon = new StringBuilder();

        int numberOfColumns = readings.get(0).length();

        for (int i = 0; i < numberOfColumns; i++) {
            String bits = "";
            for (String reading : readings) {
                bits += String.valueOf(reading.charAt(i));
            }
            int zeros = StringUtils.countMatches(bits, '0');
            int ones = StringUtils.countMatches(bits, '1');

            if (zeros > ones) {
                gamma.append("0");
                epsilon.append("1");
            } else {
                gamma.append("1");
                epsilon.append("0");
            }
        }

        return Integer.parseInt(gamma.toString(), 2) * Integer.parseInt(epsilon.toString(), 2);
    }

    public int getLifeSupportRating(List<String> readings) {
        String o2GenRating = getOxygenGeneratorRating(readings, 0);
        String co2ScrubberRating = getCO2ScrubberRating(readings, 0);

        return Integer.parseInt(o2GenRating, 2) * Integer.parseInt(co2ScrubberRating, 2);
    }

    private String getOxygenGeneratorRating(List<String> readings, int column) {
        if (readings.size() > 1) {
            List<String> zeros = new ArrayList<>();
            List<String> ones = new ArrayList<>();

            for (String reading : readings) {
                String bit = String.valueOf(reading.charAt(column));
                if (StringUtils.equals("0", bit)) {
                    zeros.add(reading);
                } else {
                    ones.add(reading);
                }
            }

            if (ones.size() >= zeros.size()) {
                return getOxygenGeneratorRating(ones, ++column);
            } else {
                return getOxygenGeneratorRating(zeros, ++column);
            }
        }

        return readings.get(0);
    }

    private String getCO2ScrubberRating(List<String> readings, int column) {
        if (readings.size() > 1) {
            List<String> zeros = new ArrayList<>();
            List<String> ones = new ArrayList<>();

            for (String reading : readings) {
                String bit = String.valueOf(reading.charAt(column));
                if (StringUtils.equals("0", bit)) {
                    zeros.add(reading);
                } else {
                    ones.add(reading);
                }
            }

            if (zeros.size() <= ones.size()) {
                return getCO2ScrubberRating(zeros, ++column);
            } else {
                return getCO2ScrubberRating(ones, ++column);
            }
        }

        return readings.get(0);
    }
}
