package Part1_SequentialList;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Question2 {
    public static void main(String[] args) {
        // Write a program to read the value of the radius of a circle,
        // and then display the area of the circle with four decimal
        // places, as shown in the examples.
        // Formula for the area: area = π * radius²
        // Consider the value of π = 3.14159

        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);
        double pi = 3.14159, r, AreaOfCircle;

        r = keyboard.nextDouble();

        AreaOfCircle = pi * Math.pow(r, 2.0);

        System.out.printf("A=%.4f", AreaOfCircle);

        keyboard.close();
    }
}