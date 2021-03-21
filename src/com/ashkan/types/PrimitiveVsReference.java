package com.ashkan.types;

import java.awt.*;

public class PrimitiveVsReference {

    Point point1 = new Point(1,1);
    Point point2 = point1;

    public Point getPoint() {
        point1.x = 2;
        return point2;
    }

    /* Reference types are copied by the reference whereas primitive types are copied by their value
       and these values are completely independent of each other. */
}
