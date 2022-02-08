package com.thekerker.utils;

import com.thekerker.day2.models.AllowedPositions;
import com.thekerker.day2.models.Position;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Slf4j
public class FileReader {
    public static List<Integer> readDay1InputFile() {
        List<Integer> measurements = new ArrayList<>();

        Path path = Paths.get("src/main/resources/day1input.txt");
        try (Scanner scanner = new Scanner(path, StandardCharsets.UTF_8.name())) {
            while (scanner.hasNext()) {
                measurements.add(Integer.valueOf(scanner.next()));
            }
        } catch (IOException e) {
            log.error("Unable to open file", e.getMessage());
        }

        return measurements;
    }

    public static List<Position> readDay2InputFile() {
        List<Position> positions = new ArrayList<>();

        Path path = Paths.get("src/main/resources/day2input.txt");
        try (Scanner scanner = new Scanner(path, StandardCharsets.UTF_8.name())) {
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(" ");
                positions.add(new Position(AllowedPositions.valueOf(line[0].toUpperCase()), Integer.parseInt(line[1])));
            }
        } catch (IOException e) {
            log.error("Unable to open file", e.getMessage());
        }

        return positions;
    }

    public static List<String> readDay3InputFile() {
        List<String> readings = new ArrayList<>();

        Path path = Paths.get("src/main/resources/day3input.txt");
        try (Scanner scanner = new Scanner(path, StandardCharsets.UTF_8.name())) {
            while (scanner.hasNextLine()) {
                readings.add(scanner.nextLine());
            }
        } catch (IOException e) {
            log.error("Unable to open file", e.getMessage());
        }

        return readings;
    }
}
