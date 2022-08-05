package com.sparta.jn.shapes;

public class ShapePrinter {

    public static void printShape(Shapes[] shapesIn, String strIn) {
        for (Shapes element : shapesIn) {
            if (element.getShapeType().equals(strIn)) {
                System.out.println(element.toString() + " area is " + element.getArea());
            }
        }
    }

    public static void printShape(Shapes[] shapesIn) {
        for (Shapes element : shapesIn) {
            System.out.println(element.toString() + " area is " + element.getArea());
        }
    }
}
