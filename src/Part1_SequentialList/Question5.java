package Part1_SequentialList;

import java.util.Scanner;
import java.util.Locale;

public class Question5 {
    public static void main(String[] args) {
        // Write a program to read the code of part 1, the number of units of part 1,
        // and the unit price of part 1. Then read the code of part 2, the number of
        // units of part 2, and the unit price of part 2. Calculate and display the
        // total amount to be paid.

        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);
        int Quantity1, Quantity2;
        double Price1, Price2, Total;

        @SuppressWarnings("unused")
        int Code1 = keyboard.nextInt();
        Quantity1 = keyboard.nextInt();
        Price1 = keyboard.nextDouble();

        @SuppressWarnings("unused")
        int Code2 = keyboard.nextInt();
        Quantity2 = keyboard.nextInt();
        Price2 = keyboard.nextDouble();

        Total = Quantity1 * Price1 + Quantity2 * Price2;

        System.out.printf("Total to Pay: R$ %.2f", Total);

        keyboard.close();
    }
}