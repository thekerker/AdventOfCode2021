package com.thekerker.day1.utils;

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
    public static List<Integer> readInputFile() {
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
