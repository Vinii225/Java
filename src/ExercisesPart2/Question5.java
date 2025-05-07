package ExercisesPart2;

import java.util.Locale;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // Based on the table below, write a program that reads
        // an item code and the quantity of that item. Then, calculate
        // and display the total amount to pay.

        // Code Item Price
        // 1 Hot Dog 4.00
        // 2 X-Salada 4.50
        // 3 X-Bacon 5.00
        // 4 Simple Toast 2.00
        // 5 Soda 1.50

        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);
        int Code, Quantity;
        double Price;

        Code = keyboard.nextInt();
        Quantity = keyboard.nextInt();

        if (Code == 1) {
            Price = Quantity * 4.00;
            System.out.printf("Total: $%.2f", Price);
        } else if (Code == 2) {
            Price = Quantity * 4.50;
            System.out.printf("Total: $%.2f", Price);
        } else if (Code == 3) {
            Price = Quantity * 5.00;
            System.out.printf("Total: $%.2f", Price);
        } else if (Code == 4) {
            Price = Quantity * 2.00;
            System.out.printf("Total: $%.2f", Price);
        } else if (Code == 5) {
            Price = Quantity * 1.50;
            System.out.printf("Total: $%.2f", Price);
        } else {
            System.out.println("Invalid Code...");
        }

        keyboard.close();
    }
}