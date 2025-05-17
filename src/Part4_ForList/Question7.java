package Part4_ForList;

import java.util.Scanner;
import java.lang.Math;

public class Question7 {
    public static void main(String[] args) {

        /*
         * Write a program to read a positive integer N.
         * The program should then display N lines,
         * starting from 1 up to N. For each line,
         * show the line number, then the square
         * and the cube of the value, as shown
         * in the example.
         */

        Scanner keyboard = new Scanner(System.in);
        int N;

        N=keyboard.nextInt();

        for (int i=1; i<=N; i++) {
            System.out.printf("%d %.0f %.0f\n", i, Math.pow(i, 2), Math.pow(i, 3));
        }
        keyboard.close();
    }
}