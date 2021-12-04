package com.thekerker.day1;

import com.thekerker.day1.services.SonarSweeper;
import com.thekerker.day1.utils.FileReader;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class App {

    public static void main(String[] args) {
        SonarSweeper sonarSweeper = new SonarSweeper();

        List<Integer> measurements = FileReader.readInputFile();

        int depthIncreases = sonarSweeper.getDepthIncreases(measurements);

        System.out.println("Number of depth increases: " + depthIncreases);

        int slidingWindowIncreaes = sonarSweeper.getSlidingWindowIncreases(measurements);

        System.out.println("Number of sliding window increases: " + slidingWindowIncreaes);
    }


}
