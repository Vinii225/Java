package Part4_ForList;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        /*
         * Read an integer N and calculate all
         * its divisors.
         */

        Scanner keyboard = new Scanner(System.in);
        int n;

        n = keyboard.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        keyboard.close();
    }
}