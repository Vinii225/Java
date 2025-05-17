package Part4_ForList;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        /*
         * Write a program to read a number N. Then read N pairs of
         * numbers and show the division of the first by the second.
         * If the denominator is equal to zero, display the message
         * "Impossible division".
         */

        Scanner keyboard = new Scanner(System.in);
        int N, n1, n2;

        N = keyboard.nextInt();

        for (int i = 0; i < N; i++) {
            n1 = keyboard.nextInt();
            n2 = keyboard.nextInt();

            if (n2 == 0) {
                System.out.println("Impossible division.");
            } else {
                System.out.printf("%.1f", (double) n1 / n2);
            }
        }
        keyboard.close();
    }
}