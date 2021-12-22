package com.thekerker.day3;

import com.thekerker.day3.services.PowerConsumptionChecker;
import com.thekerker.utils.FileReader;

import java.util.List;

public class Day3App {
    public static void main(String[] args) {
        List<String> readings = FileReader.readDay3InputFile();

        PowerConsumptionChecker pcc = new PowerConsumptionChecker();

        int powerConsumption = pcc.getPowerConsumption(readings);

        System.out.println("Power consumption: " + powerConsumption);

        int lifeSupportRating = pcc.getLifeSupportRating(readings);

        System.out.println("Life Support Rating: " + lifeSupportRating);
    }
}
