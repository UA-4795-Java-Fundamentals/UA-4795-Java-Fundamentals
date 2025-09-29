package com.softserve.academy.module6;

public class Parallelogram extends Rectangle {
    public int angle;

    @Override
    public double getArea() {
        return (width * height * Math.sin(angle * Math.PI / 180));
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        if (angle != 0) {
            this.angle = angle;
        }
    }
}
