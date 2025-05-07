package ExercisesPart2;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Write a program that reads an integer and then
        // tells whether this number is negative or not.

        Scanner keyboard = new Scanner(System.in);
        int n1;

        n1 = keyboard.nextInt();

        if (n1 > 0) {
            System.out.println("POSITIVE.");
        } else if (n1 < 0) {
            System.out.println("NEGATIVE.");
        } else {
            System.out.println("ZERO.");
        }

        keyboard.close();
    }
}