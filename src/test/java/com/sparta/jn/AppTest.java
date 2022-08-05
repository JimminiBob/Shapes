package com.sparta.jn;

import com.sparta.jn.shapes.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest 
{
    @Test
    @DisplayName("Should print out only the shapes entered as a string")
    void shouldPrintOutOnlyTheShapesEnteredAsAString() {
        Rectangle rect1 = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(7, 3);
        Rectangle rect3 = new Rectangle(60, 4);
        Triangle tri1 = new Triangle(12, 32);
        Triangle tri2 = new Triangle(4, 9);
        Circle cir1 = new Circle(2);

        Shapes[] myShapes = {rect1, tri1, rect2, tri2, rect3, cir1};

    }
}
