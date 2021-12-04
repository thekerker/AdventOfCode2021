package com.thekerker.day1.utils;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileReaderTest {

    @Test
    public void shouldReadFile() {
        List<Integer> contents = FileReader.readInputFile();

        assertEquals(2000, contents.size());
    }
}
