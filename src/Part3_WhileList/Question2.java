package Part3_WhileList;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Write a program to read the coordinates (X, Y) of an undetermined
        // number of points in the Cartesian coordinate system. For each
        // point, determine and display the quadrant it belongs to. The
        // program will terminate when at least one of the coordinates
        // is zero (in this case, no message should be displayed).

        Scanner keyboard = new Scanner(System.in);
        int X, Y;

        while (true) {
            X=keyboard.nextInt();
            Y=keyboard.nextInt();
            
            if (X>0 && Y>0) {
                System.out.println("First Quadrant.");
            } else if (X<0 && Y>0) {
                System.out.println("Second Quadrant.");
            } else if (X<0 && Y<0) {
                System.out.println("Third Quadrant.");
            } else if (X>0 && Y<0) {
                System.out.println("Fourth Quadrant.");
            } else if (X==0 || Y==0) {
                break;
            }
        }
        keyboard.close();
    }
}