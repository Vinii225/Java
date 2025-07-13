package Part5_ObjectedOrientedList;

import java.util.Locale;
import java.util.Scanner;

import Part5_ObjectedOrientedList.Entities.Employee;

public class Question2 {
    public static void main(String[] args) {
        
        // Entity: Employee

        /*
        * Write a program to read an employee's name, gross salary, and tax amount.
        * Then, show the employee's data (name and net salary).
        * Next, increase the employee's salary based on a given percentage and show the updated data.
        * You must create a class to represent the employee with the following members:
        * - attributes: Name, GrossSalary, Tax
        * - methods: NetSalary(), IncreaseSalary(percentage), toString()
        */

        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);
        double percentage;

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = keyboard.nextLine();
        System.out.println("Gross Salary: ");
        employee.grossSalary = keyboard.nextDouble();
        System.out.println("Tax: ");
        employee.tax = keyboard.nextDouble();

        System.out.println("Employee: " + employee);

        System.out.println("Which percentage to increase salary?");
        percentage = keyboard.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee);

        keyboard.close();
    }
}