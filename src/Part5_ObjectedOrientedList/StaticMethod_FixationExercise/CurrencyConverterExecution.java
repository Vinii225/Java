package Part5_ObjectedOrientedList.StaticMethod_FixationExercise;

import java.util.Scanner;
import java.util.Locale;

public class CurrencyConverterExecution {
    public static void main(String[] args) {

        // CurrencyConverter with static methods.

        /*
         * Create a program to read the dollar exchange rate, and then a value in reais
         * to be converted to dollars by a person. Display how many dollars the person
         * will receive for the reais, considering that the person will have to pay 6%
         * IOF (Tax on Financial Operations) on the dollar amount. Create a
         * CurrencyConverter
         * class to be responsible for the calculations.
         */

        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);

        double quantityInReal;

        System.out.println("The dollar price is " + CurrencyConverter.dollarUSPrice + ".");
        System.out.printf("How many reais you want to convert? ");
        quantityInReal = keyboard.nextDouble();

        System.out.printf("Amount of dollars with IOF: %.2f", CurrencyConverter.quantityInDolarWithIOF(quantityInReal));
        keyboard.close();
    }
}
