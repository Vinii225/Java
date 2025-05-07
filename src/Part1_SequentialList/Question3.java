package Part1_SequentialList;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // Write a program to read four integer values A, B, C and D.
        // Then, calculate and display the difference between the
        // product of A and B and the product of C and D, according to the formula:
        // DIFFERENCE = (A * B - C * D)

        Scanner keyboard = new Scanner(System.in);
        int A, B, C, D, Difference;

        A = keyboard.nextInt();
        B = keyboard.nextInt();
        C = keyboard.nextInt();
        D = keyboard.nextInt();

        Difference = (A * B - C * D);

        System.out.println("Difference = " + Difference);

        keyboard.close();
    }
}
