package com.thekerker.utils;

import com.thekerker.day2.models.Position;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileReaderTest {

    @Test
    public void shouldReadDay1InputFile() {
        List<Integer> contents = FileReader.readDay1InputFile();

        assertEquals(2000, contents.size());
    }

    @Test
    public void shouldReadDay2InputFile() {
        List<Position> contents = FileReader.readDay2InputFile();

        assertEquals(1000, contents.size());
    }

    @Test
    public void shouldReadDay3InputFile() {
        List<String> contents = FileReader.readDay3InputFile();

        assertEquals(1000, contents.size());
    }
}
