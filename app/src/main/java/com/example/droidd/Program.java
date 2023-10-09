package com.example.droidd;

import java.util.ArrayList;

public class Program {

    String name;
    ArrayList<Ball> ballsList;
    ArrayList<Double> pausesBetweenBalls;

    public Program(String name,ArrayList<Ball> ballsList, ArrayList<Double> pausesBetweenBalls) {
        this.name = name;
        this.ballsList = ballsList;
        this.pausesBetweenBalls = pausesBetweenBalls;
    }
}
