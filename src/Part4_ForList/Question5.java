package Part4_ForList;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        /*
         * Read a value N. Calculate and write its respective factorial.
         * The factorial of N = N * (N-1) * (N-2) * (N-3) * ... * 1.
         * Remember that, by definition, the factorial of 0 is 1.
         */

        Scanner keyboard = new Scanner(System.in);
        int n, factorial = 1;

        n = keyboard.nextInt();

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
        keyboard.close();
    }
}