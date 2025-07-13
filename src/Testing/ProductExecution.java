package Testing;

import Testing.Entities.Product;

import java.util.Scanner;
import java.util.Locale;

public class ProductExecution {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);

        int quantity;

        Product product = new Product();
        
        System.out.println("Enter Product data: ");
        System.out.print("Name: ");
        product.name = keyboard.nextLine();
        System.out.print("Price: ");
        product.price = keyboard.nextDouble();
        System.out.print("Quantity in Stock: ");
        product.quantity = keyboard.nextInt();

        System.out.printf("\n" + product.toString() + "\n");

        System.out.print("\nEnter the number of products to be added in stock: ");
        quantity = keyboard.nextInt();
        product.addProducts(quantity);

        System.out.printf("\n" + product.updatedString() + "\n");

        System.out.printf("\nEnter the number of products to be removed from stock: ");
        quantity = keyboard.nextInt();
        product.removeProducts(quantity);

        System.out.printf("\n" + product.updatedString());

        keyboard.close();
    }
}
