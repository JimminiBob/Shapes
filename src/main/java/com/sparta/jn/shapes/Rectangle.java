package com.sparta.jn.shapes;

public class Rectangle implements Shapes{
    private double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width*this.length;
    }
    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
