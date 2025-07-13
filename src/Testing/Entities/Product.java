package Testing.Entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

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
