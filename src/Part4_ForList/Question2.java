package Part4_ForList;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Read an integer value N. This value will
        // represent the number of integer values X
        // to be read next. For each of these values,
        // determine whether it is within the interval
        // [10, 20] or outside it. Display how many of
        // these values are "in" the interval and how many
        // are "out", following the format shown in the example.

        Scanner keyboard = new Scanner(System.in);
        int N, X, SumIn = 0, SumOut = 0;

        N = keyboard.nextInt();

        for (int i = 1; i <= N; i++) {
            X = keyboard.nextInt();
            if (X >= 10 && X <= 20) {
                SumIn += 1;
            } else {
                SumOut += 1;
            }
        }

        System.out.printf("%d In\n", SumIn);
        System.out.printf("%d Out", SumOut);

        keyboard.close();
    }
}