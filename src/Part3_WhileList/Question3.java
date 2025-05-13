package Part3_WhileList;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // A fuel station wants to determine which of its products is preferred
        // by its customers.Write a program to read the type of fuel
        // supplied (coded as follows):
        // 1. Alcohol
        // 2. Gasoline
        // 3. Diesel
        // 4. End
        // If the user enters an invalid code (outside the range 1 to 4),
        // a new code must be requested (until a valid one is provided).
        // The program will end when the number 4 is entered. At the end,
        // the program should print the message: "THANK YOU" and the number
        // of customers who chose each type of fuel, as shown in the example.

        Scanner keyboard = new Scanner(System.in);
        int code, Alcohol = 0, Gasoline = 0, Diesel = 0;

        while (true) {
            System.out.println("1. Alcohol");
            System.out.println("2. Gasoline");
            System.out.println("3. Diesel");
            System.out.println("4. End\n");

            code = keyboard.nextInt();
            if (code == 1) {
                Alcohol++;
            } else if (code == 2) {
                Gasoline++;
            } else if (code == 3) {
                Diesel++;
            } else if (code == 4) {
                break;
            } else {
                continue;
            }
        }
        System.out.println("THANK YOU");
        System.out.println("Alcohol: " + Alcohol);
        System.out.println("Gasoline: " + Gasoline);
        System.out.println("Diesel: " + Diesel);

        keyboard.close();
    }
}