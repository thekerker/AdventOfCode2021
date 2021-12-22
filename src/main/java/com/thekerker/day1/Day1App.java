package com.thekerker.day1;

import com.thekerker.day1.services.SonarSweeper;
import com.thekerker.utils.FileReader;

import java.util.List;

public class Day1App {

    public static void main(String[] args) {
        SonarSweeper sonarSweeper = new SonarSweeper();

        List<Integer> measurements = FileReader.readDay1InputFile();

        int depthIncreases = sonarSweeper.getDepthIncreases(measurements);

        System.out.println("Number of depth increases: " + depthIncreases);

        int slidingWindowIncreaes = sonarSweeper.getSlidingWindowIncreases(measurements);

        System.out.println("Number of sliding window increases: " + slidingWindowIncreaes);
    }


}
