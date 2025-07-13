package Part5_ObjectedOrientedList;

import java.util.Scanner;
import Part5_ObjectedOrientedList.Entities.Rectangle;
import java.util.Locale;

public class Question1 {
    public static void main(String[] args) {

        // Entity: Rectangle

        /*
        * Write a program to read the width and height of a rectangle.
        * Then, show the rectangle's area, perimeter, and diagonal, as shown in the example.
        * You must create a class to represent the rectangle with the following members:
        * - two attributes: width and height
        * - methods: Area(), Perimeter(), Diagonal()
        */

        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = keyboard.nextDouble();
        rectangle.height = keyboard.nextDouble();

        System.out.printf("Area = %.2f\n", rectangle.area());
        System.out.printf("Perimeter = %.2f\n", rectangle.perimeter());
        System.out.printf("Diagonal = %.2f", rectangle.diagonal());

        keyboard.close();
    }
}