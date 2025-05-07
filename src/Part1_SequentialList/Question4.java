package Part1_SequentialList;

import java.util.Locale;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        // Write a program that reads an employee's number,
        // the number of hours worked, and the amount he receives per hour.
        // Then, calculate the employee’s salary. Finally,
        // display the employee's number and salary, with two decimal places.

        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);
        int EmployeeNum, WorkedHours;
        double AmmountHour, Salary;

        EmployeeNum = keyboard.nextInt();
        WorkedHours = keyboard.nextInt();
        AmmountHour = keyboard.nextDouble();

        Salary = WorkedHours * AmmountHour;

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", EmployeeNum, Salary);

        keyboard.close();
    }
}
