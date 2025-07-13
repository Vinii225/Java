package Part5_ObjectedOrientedList.Entities;

import java.lang.Math;

public class Rectangle {

    // Used in: Question1.java (Rectangle area, perimeter, diagonal)

    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return width + width + height + height;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0));
    }
}