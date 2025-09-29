package com.softserve.academy.module6;

public class Rectangle {
    protected int width;
    protected int height;

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getHeight() {
        return height;
    }

    public double getArea() {
        return (width * height);
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }
}
