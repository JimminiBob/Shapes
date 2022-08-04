package com.sparta.jn.shapes;

public class Square implements Shapes{
    @Override
    public double getArea(double width, double length) {
        return width*length;
    }
}
