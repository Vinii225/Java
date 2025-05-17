package Part4_ForList;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        /*
         * Read an integer N and calculate all
         * its divisors.
         */

        Scanner keyboard = new Scanner(System.in);
        int N;

        N = keyboard.nextInt();

        for (int i = 1; i <= N; i++) {

            if (N % i == 0) {
                System.out.println(i);
            }
        }
        keyboard.close();
    }
}