package Part5_ObjectedOrientedList;

import Part5_ObjectedOrientedList.Entities.Student;
import java.util.Scanner;
import java.util.Locale;

public class Question3 {
    public static void main(String[] args) {
        
        // Entity: Student
        /*
        * Write a program to read a student's name and three grades.
        * At the end, show the student's final grade and indicate if the student is approved or not.
        * The student passes if the final grade is at least 60.
        * If the student is not approved, show how many points are missing for approval.
        * You must create a class to represent the student with the following members:
        * - attributes: Name, Grade1, Grade2, Grade3
        * - methods: FinalGrade(), VerifyPoints()
        */

        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);

        Student student = new Student();

        student.name = keyboard.nextLine();

        while (true) {
            student.grade1 = keyboard.nextDouble();
            if (student.grade1 >= 0 && student.grade1 <= 30) {
                continue;
            } else {
                student.grade1 = keyboard.nextDouble();
            }

            student.grade2 = keyboard.nextDouble();
            if (student.grade2 >= 0 && student.grade2 <= 35) {
                continue;
            } else {
                student.grade1 = keyboard.nextDouble();
            }
            
            student.grade3 = keyboard.nextDouble();
            if (student.grade3 >= 0 && student.grade1 <= 35) {
                break;
            } else {
                student.grade1 = keyboard.nextDouble();
            }
        }

        if (student.verifyPoints() > 0) {
            System.out.println("Final Grade: " + student.getFinalGrade());
            System.out.println("Failed");
            System.out.println("Missing " + student.verifyPoints() + " Points");
        } else if (student.verifyPoints() == 0) {
            System.out.println("Final Grade: " + student.getFinalGrade());
            System.out.println("Pass");
        }

        keyboard.close();
    }
}