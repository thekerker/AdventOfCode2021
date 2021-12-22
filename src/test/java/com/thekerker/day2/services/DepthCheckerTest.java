package com.thekerker.day2.services;

import com.thekerker.day2.models.Position;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepthCheckerTest {
    private DepthChecker depthChecker;

    private List<Position> positions;

    @BeforeEach
    public void setupTests() {
        depthChecker = new DepthChecker();

        positions = new ArrayList<>();
        positions.add(new Position("forward", 5));
        positions.add(new Position("down",  5));
        positions.add(new Position("forward",  8));
        positions.add(new Position("up",  3));
        positions.add(new Position("down",  8));
        positions.add(new Position("forward",  2));
    }

    @Test
    public void shouldGetFinalDepth() {
        int expected = 150;

        int actual = depthChecker.getFinalDepth(positions);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetFinalDepthWithAim() {
        int expected = 900;

        int actual = depthChecker.getFinalDepthWithAim(positions);

        assertEquals(expected, actual);
    }
}
