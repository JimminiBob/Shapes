package com.sparta.jn.shapes;

/**
 * Hello world!
 *
 */
public class App 
{
    //Loader
//Primitive Array - Shapes[]
//for each loop - calls getArea for all shapes in the array
//Adv: pass name of shape ("String") returns area if shape is in array
    public static void main( String[] args ) {
        Rectangle rect1 = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(7, 3);
        Rectangle rect3 = new Rectangle(60, 4);
        Triangle tri1 = new Triangle(12, 32);
        Triangle tri2 = new Triangle(4, 9);
        Circle cir1 = new Circle(2);

        Shapes[] myShapes = {rect1, tri1, rect2, tri2, rect3, cir1};

//        for (Shapes element: myShapes) {
//            System.out.println(element.toString() + " area is " + element.getArea());
//        }

//        for (Shapes element: myShapes) {
//            if (element.getShapeType().equals("Circle")) {
//                System.out.println(element.toString() + " area is " + element.getArea());
//            }
//        }
//        ShapePrinter.printShape(myShapes);
        ShapePrinter.printShape(myShapes, "Triangle");


    }


}
