package Lb3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product product1 = new Product(1, "Cheese", 300);
        Product product2 = new Product(2, "Bread", 30);
        Product product3 = new Product(3, "Milk", 50);
        Product product4 = new Product(4, "Meat", 245);

        Cart.addProduct(product1);
        Cart.addProduct(product2);
        Cart.addProduct(product3);
        Cart.addProduct(product4);

        Order order = new Order(1, Cart.getCheckedProduct(), "Processing");

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Delete product");
            System.out.println("3. Complete the order");
            System.out.println("4. Checking your order");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
            System.out.println("\nAvailable Products:");
            for (Product product : Cart.getCheckedProduct()) {
            System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
            }

            System.out.println("\nWhat product do you want to add:");
            String prodName = scanner.nextLine();
            Product selectedProduct = null;
            for (Product product : Cart.getCheckedProduct()) {
                if (product.getName().equalsIgnoreCase(prodName)) {
                selectedProduct = product;
                break;
            }
        }

    if (selectedProduct != null) {
        order.addProduct(selectedProduct);
        System.out.println("Product added to the order.");
    } 
                else {
                System.out.println("Product not found in the cart.");
                }
                break;

                case 2:
                System.out.println("\nWhat product do you want to delete:");
                String prodToDelete = scanner.nextLine();
                Product productToDelete = null;
                for (Product product : order.getProducts()) {
                    if (product.getName().equalsIgnoreCase(prodToDelete)) {
                        productToDelete = product;
                        break;
                    }
                }
                if (productToDelete != null) {
                    order.removeProduct(productToDelete);
                    System.out.println("Product removed from the order.");
                } else {
                    System.out.println("Product not found in the order.");
                }
                break;
            
                case 3:
                    System.out.println("\nOrder completed. Thank you!");
                    order.setStatus("Completed");
                    break;
                case 4:
                    System.out.println("\nChecking your order:");
                    System.out.println("Order ID: " + order.getOrderId());
                    System.out.println("Products in the order:");
                    for (Product product : order.getProducts()) {
                        System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
                    }
                    System.out.println("Order Status: " + order.getStatus());
                    break;
                case 5:
                    System.out.println("Thank you for your purchase, Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Unknown command, try again.");
            }
        }
    }
}


