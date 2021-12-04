package com.thekerker.day1;

import com.thekerker.day1.services.SonarSweeper;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Slf4j
public class App {

    public static void main(String[] args) {
        SonarSweeper sonarSweeper = new SonarSweeper();

        List<Integer> measurements = getMeasurements();

        int count = sonarSweeper.getDepthIncreases(measurements);

        System.out.println("Number of depth increases: " + count);
    }

    private static List<Integer> getMeasurements() {
        List<Integer> measurements = new ArrayList<>();

        Path path = Paths.get("src/main/resources/input.txt");
        try (Scanner scanner = new Scanner(path, StandardCharsets.UTF_8.name())) {
            while (scanner.hasNext()) {
                measurements.add(Integer.valueOf(scanner.next()));
            }
        } catch (IOException e) {
            log.error("Unable to open file", e.getMessage());
        }

        return measurements;
    }
}
