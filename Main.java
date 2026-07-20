package main;

import java.util.Scanner;
import service.Shop;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        int choice;

        do {
            System.out.println("\n========================================");
            System.out.println("     FOOTWEAR SHOP MANAGEMENT SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Generate Bill");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    shop.addProduct();
                    break;

                case 2:
                    shop.displayProducts();
                    break;

                case 3:
                    shop.searchProduct();
                    break;

                case 4:
                    shop.updateProduct();
                    break;

                case 5:
                    shop.deleteProduct();
                    break;

                case 6:
                    shop.generateBill();
                    break;

                case 7:
                    System.out.println("\nThank you for using Shop Management System.");
                    System.out.println("Have a nice day!");
                    break;

                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }

        } while (choice != 7);

        scanner.close();
    }
}