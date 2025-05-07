package ExercisesPart2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Write a program that reads an integer
        // and then tells whether this number is even or odd.

        Scanner keyboard = new Scanner(System.in);
        int n1;

        n1 = keyboard.nextInt();

        if (n1 % 2 == 0) {
            System.out.println("EVEN.");
        } else {
            System.out.println("ODD.");
        }

        keyboard.close();
    }
}