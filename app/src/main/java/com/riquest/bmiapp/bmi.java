package com.riquest.bmiapp;

public class bmi {

    public static double process(double weight, double height) {
        double result;
        double duwur = (height * height) / 10000;
        result = weight / duwur;
        return result;
    }
}
