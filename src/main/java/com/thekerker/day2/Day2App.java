package com.thekerker.day2;

import com.thekerker.day2.models.Position;
import com.thekerker.day2.services.DepthChecker;
import com.thekerker.utils.FileReader;

import java.util.List;

public class Day2App {
    public static void main(String[] args) {
        List<Position> positions = FileReader.readDay2InputFile();

        DepthChecker depthChecker = new DepthChecker();

        int finalDepth = depthChecker.getFinalDepth(positions);

        int finalDepthWithAim = depthChecker.getFinalDepthWithAim(positions);

        System.out.println("Final depth: " + finalDepth);

        System.out.println("Final depth with aim: " + finalDepthWithAim);
    }
}
