package Part5_ObjectedOrientedList;

import java.util.Scanner;

import Part5_ObjectedOrientedList.Entities.Product;

import java.util.Locale;

public class ProductExecution {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);

        String name;
        double price;
        int quantity;

        System.out.println("Enter Product data: ");
        System.out.print("Name: ");
        name = keyboard.nextLine();
        System.out.print("Price: ");
        price = keyboard.nextDouble();
        Product product = new Product(name, price);

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
