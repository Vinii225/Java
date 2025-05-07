package ExercisesPart2;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        // Read the starting and ending hours of a game.
        // Then calculate the duration of the game, knowing
        // that it may start on one day and finish on another,
        // with a minimum duration of 1 hour and a maximum duration
        // of 24 hours.

        Scanner keyboard = new Scanner(System.in);
        int StartH, EndH, duration;

        StartH = keyboard.nextInt();
        EndH = keyboard.nextInt();

        if (EndH > StartH) {
            duration = EndH - StartH;
        } else {
            duration = (24 - StartH) + EndH;
        }

        System.out.printf("The game lasted: %d Hour(s)", duration);

        keyboard.close();
    }
}