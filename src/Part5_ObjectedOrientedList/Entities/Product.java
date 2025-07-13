package Part5_ObjectedOrientedList.Entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name=name;
        this.price=price;
        this.quantity=quantity;

    }

    public Product(String name, double price) {
        this.name=name;
        this.price=price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String updatedString() {
        return "Updated Data: " + name + ", $ " + price + ", " + quantity + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }

    public String toString() {
        return "Product Data: " + name + ", $ " + price + ", " + quantity + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
