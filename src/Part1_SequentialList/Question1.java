package Part1_SequentialList;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Write a program to read two integer values,
        // and then display on the screen the sum of
        // these numbers with an explanatory message,
        // as shown in the examples.

        Scanner keyboard = new Scanner(System.in);
        int n1, n2, sum;

        n1 = keyboard.nextInt();

        n2 = keyboard.nextInt();

        sum = n1 + n2;

        System.out.printf("SUM = %d", sum);
        keyboard.close();
    }
}