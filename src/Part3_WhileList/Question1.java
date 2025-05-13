package Part3_WhileList;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Write a program that repeatedly reads a password until it is valid.
        // For each incorrect password entered, display the message 
        // "Invalid Password". When the correct password is entered, 
        // display "Access Granted" and end the program. Assume that
        // the correct password is the value 2002.

        Scanner keyboard = new Scanner(System.in);
        int correct_password=2002, verify;

        while (true) {
            verify=keyboard.nextInt();
            if (verify==correct_password) {
                System.out.println("Acess Granted");
                break;
            } else {
                System.out.println("Invalid Password");
            }
        }
        keyboard.close();
    }
}