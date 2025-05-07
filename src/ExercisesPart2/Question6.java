package ExercisesPart2;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        // You must write a program that reads any given value
        // and displays a message indicating in which of the following
        // intervals the value falls: (0,25), (25,50), (50,75), (75,100)
        // If the value does not fall within any of these intervals,
        // the program must display the message: "Out of range".

        Scanner keyboard = new Scanner(System.in);
        double value;

        value = keyboard.nextDouble();

        if (value >= 0 && value <= 25) {
            System.out.println("Range: [0, 25]");
        } else if (value > 25 && value <= 50) {
            System.out.println("Range: (25, 50]");
        } else if (value>50 && value <=75) {
            System.out.println("Range: (50,75]");
        }else if (value > 75 && value <= 100) {
            System.out.println("Range: (75, 100]");
        } else {
            System.out.println("Out of range.");
        }

        keyboard.close();
    }
}