package ExercisesPart2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // Read two integer values (A and B). Then, the program should display
        // the message "Are Multiples" or "Are Not Multiples"
        // indicating if the values entered are multiples of each other.
        // The numbers should be allowed to be entered in either ascending or descending
        // order.

        Scanner keyboard = new Scanner(System.in);
        int A, B;

        A = keyboard.nextInt();
        B = keyboard.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("They are multiples.");
        } else {
            System.out.println("They are not multiples.");
        }

        keyboard.close();
    }
}