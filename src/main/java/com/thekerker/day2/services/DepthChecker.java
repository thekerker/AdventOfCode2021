package com.thekerker.day2.services;

import com.thekerker.day2.models.Position;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class DepthChecker {
    public int getFinalDepth(List<Position> positions) {
        int horizontalPosition = 0;
        int depth = 0;

        for (Position position : positions) {
            int currentDepth = position.getDepth();
            switch (position.getPosition()) {
                case "forward":
                    horizontalPosition += currentDepth;
                    break;
                case "down":
                    depth += currentDepth;
                    break;
                case "up":
                    depth -= currentDepth;
                    break;
                default:
                    log.error("Invalid position: " + position.getPosition());
                    break;
            }
        }

        return horizontalPosition * depth;
    }

    public int getFinalDepthWithAim(List<Position> positions) {
        int horizontalPosition = 0;
        int depth = 0;
        int aim = 0;

        for (Position position : positions) {
            int currentDepth = position.getDepth();
            switch (position.getPosition()) {
                case "forward":
                    horizontalPosition += currentDepth;
                    depth += aim * currentDepth;
                    break;
                case "down":
                    aim += currentDepth;
                    break;
                case "up":
                    aim -= currentDepth;
                    break;
                default:
                    log.error("Invalid position: " + position.getPosition());
                    break;
            }
        }

        return horizontalPosition * depth;
    }
}
