import java.util.*;
public class SupermarketBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        Product[] products = new Product[n];
        double grandTotal = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1));
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Category: ");
            String category = sc.nextLine();
            System.out.print("Brand: ");
            String brand = sc.nextLine();
            System.out.print("Price per unit: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();
            products[i] = new Product(id, name, category, brand, price, qty);
            grandTotal += products[i].totalCost;
        }
    }
}
class Product {
    int productId;
    String productName;
    String category;
    String brand;
    double price;
    int quantity;
    double totalCost;
    Product(int productId, String productName, String category,String brand, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.totalCost = price * quantity;
    }
    void display() {
        System.out.println("\nProduct ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Brand: " + brand);
        System.out.println("Price: Rs. " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: Rs. " + totalCost);
    }
} 
