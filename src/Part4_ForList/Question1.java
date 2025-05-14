package Part4_ForList;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Read an integer value X (1 ≤ X ≤ 1000). 
        // Then, display all odd numbers from 1 to X,
        // one value per line, including X if it is odd.

        Scanner keyboard = new Scanner(System.in);
        int X;

        X=keyboard.nextInt();

        if (X>=1 && X<=1000) {
            for (int i=1; i<=X; i++) {
                if (i % 2!=0) {
                    System.out.println(i);
                }
            }
        }
        keyboard.close();
    }
}