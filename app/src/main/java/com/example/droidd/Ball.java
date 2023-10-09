package com.example.droidd;

public class Ball {

    String name = "Default";

    Integer defaultHorizontalAngle = 45;
    Integer defaultVerticalAngle = 45;

    Integer defaultSpeedMotor1Min = 1420;
    Integer defaultSpeedMotor2Min = 1420;
    Integer defaultSpeedMotor3Min = 1420;

    Integer defaultSpeedMotor1Max = 3000;
    Integer defaultSpeedMotor2Max = 3000;
    Integer defaultSpeedMotor3Max = 3000;

    Integer horizontalAngel = defaultHorizontalAngle;
    Integer verticalAngel = defaultVerticalAngle;

    Integer speedMotor1 =defaultSpeedMotor1Min;
    Integer speedMotor2 =defaultSpeedMotor2Min;
    Integer speedMotor3 =defaultSpeedMotor3Min;



    public Ball(String name) {
        this.name = name;
        Integer horizontalAngel = defaultHorizontalAngle;
        Integer verticalAngel = defaultVerticalAngle;

        Integer speedMotor1=defaultSpeedMotor1Min;
        Integer speedMotor2=defaultSpeedMotor2Min;
        Integer speedMotor3=defaultSpeedMotor3Min;
    }

    public Ball(String name, Integer horizontalAngel, Integer verticalAngel, Integer speedMotor1, Integer speedMotor2, Integer speedMotor3) {
        this.name = name;
        this.horizontalAngel = horizontalAngel;
        this.verticalAngel = verticalAngel;
        this.speedMotor1 = speedMotor1;
        this.speedMotor2 = speedMotor2;
        this.speedMotor3 = speedMotor3;
    }

    public Integer getHorizontalAngel() {
        return horizontalAngel;
    }

    public void setHorizontalAngel(Integer horizontalAngel) {
        this.horizontalAngel = horizontalAngel;
    }

    public Integer getVerticalAngel() {
        return verticalAngel;
    }

    public void setVerticalAngel(Integer verticalAngel) {
        this.verticalAngel = verticalAngel;
    }

    public Integer getSpeedMotor1() {
        return speedMotor1;
    }

    public void setSpeedMotor1(Integer speedMotor1) {
        this.speedMotor1 = speedMotor1;
    }

    public Integer getSpeedMotor2() {
        return speedMotor2;
    }

    public void setSpeedMotor2(Integer speedMotor2) {
        this.speedMotor2 = speedMotor2;
    }

    public Integer getSpeedMotor3() {
        return speedMotor3;
    }

    public void setSpeedMotor3(Integer speedMotor3) {
        this.speedMotor3 = speedMotor3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDefaultSpeedMotor1Min() {
        return defaultSpeedMotor1Min;
    }

    public Integer getDefaultSpeedMotor2Min() {
        return defaultSpeedMotor2Min;
    }

    public Integer getDefaultSpeedMotor3Min() {
        return defaultSpeedMotor3Min;
    }

    public Integer getDefaultSpeedMotor1Max() {
        return defaultSpeedMotor1Max;
    }

    public Integer getDefaultSpeedMotor2Max() {
        return defaultSpeedMotor2Max;
    }

    public Integer getDefaultSpeedMotor3Max() {
        return defaultSpeedMotor3Max;
    }
}
