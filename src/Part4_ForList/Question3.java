package Part4_ForList;

import java.util.Scanner;
import java.util.Locale;

public class Question3 {
    public static void main(String[] args) {

        /*
         * Read an integer value N, which represents the number
         * of test cases that follow. Each test case consists of
         * 3 real numbers, each with one decimal place. Display
         * the weighted average for each set of 3 values, where
         * the first value has a weight of 2, the second value
         * has a weight of 3, and the third value has a weight of 5.
         */

        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);
        int N;
        double n1, n2, n3, WeightedAverage;

        N = keyboard.nextInt();

        for (int i = 0; i < N; i++) {
            n1 = keyboard.nextDouble();
            n2 = keyboard.nextDouble();
            n3 = keyboard.nextDouble();

            WeightedAverage = (double) ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
            System.out.printf("%.1f\n", WeightedAverage);
        }
        keyboard.close();
    }
}