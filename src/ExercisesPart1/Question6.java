package ExercisesPart1;

import java.lang.Math;
import java.util.Locale;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        // Make a program that reads three double-precision floating-point values: A, B,
        // and C.
        // Then, calculate and display:
        // a) the area of the right triangle with base A and height C.
        // b) the area of the circle with radius C. (pi = 3.14159)
        // c) the area of the trapezoid with bases A and B, and height C.
        // d) the area of the square with side B.
        // e) the area of the rectangle with sides A and B.

        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);
        double A, B, C, TriangleArea, CircleArea, TrapezoidArea, SquareArea, RectangleArea;

        A = keyboard.nextDouble();
        B = keyboard.nextDouble();
        C = keyboard.nextDouble();

        TriangleArea = (A * C) / 2;
        CircleArea = Math.PI * Math.pow(C, 2.0);
        TrapezoidArea = (double) ((A + B) * C) / 2;
        SquareArea = Math.pow(B, 2.0);
        RectangleArea = A * B;

        System.out.printf("Triangle: %.3f\n", TriangleArea);
        System.out.printf("Circle: %.3f\n", CircleArea);
        System.out.printf("Trapezoid: %.3f\n", TrapezoidArea);
        System.out.printf("Square: %.3f\n", SquareArea);
        System.out.printf("Rectangle: %.3f", RectangleArea);

        keyboard.close();
    }
}