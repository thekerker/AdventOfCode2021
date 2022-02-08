package com.thekerker.day2.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Position {
    private AllowedPositions position;

    private int depth;
}
