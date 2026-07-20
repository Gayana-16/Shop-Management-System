package service;

import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    private ArrayList<Product> productList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // -------------------- ADD PRODUCT --------------------

    public void addProduct() {

        System.out.println("\n========== ADD PRODUCT ==========");

        System.out.print("Enter Product ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Brand : ");
        String brand = sc.nextLine();

        System.out.print("Enter Category : ");
        String category = sc.nextLine();

        System.out.print("Enter Model : ");
        String model = sc.nextLine();

        System.out.print("Enter Color : ");
        String color = sc.nextLine();

        System.out.print("Enter Size : ");
        int size = sc.nextInt();

        System.out.print("Enter Price : ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity : ");
        int quantity = sc.nextInt();

        Product product = new Product(
                id,
                name,
                brand,
                category,
                model,
                color,
                size,
                price,
                quantity
        );

        productList.add(product);

        System.out.println("\nProduct Added Successfully!");
    }

    // -------------------- DISPLAY PRODUCTS --------------------

    public void displayProducts() {

        if (productList.isEmpty()) {
            System.out.println("\nNo Products Available.");
            return;
        }

        System.out.println("\n========== PRODUCT LIST ==========");

        for (Product product : productList) {
            product.displayProduct();
        }
    }

    // -------------------- SEARCH PRODUCT --------------------

    public void searchProduct() {

        if (productList.isEmpty()) {
            System.out.println("\nNo Products Available.");
            return;
        }

        System.out.print("\nEnter Product ID to Search : ");
        int id = sc.nextInt();

        for (Product product : productList) {

            if (product.getProductId() == id) {

                System.out.println("\nProduct Found\n");
                product.displayProduct();
                return;
            }
        }

        System.out.println("\nProduct Not Found.");
    }
        // -------------------- UPDATE PRODUCT --------------------

    public void updateProduct() {

        if (productList.isEmpty()) {
            System.out.println("\nNo Products Available.");
            return;
        }

        System.out.print("\nEnter Product ID to Update : ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Product product : productList) {

            if (product.getProductId() == id) {

                System.out.println("\nEnter New Product Details");

                System.out.print("Product Name : ");
                product.setProductName(sc.nextLine());

                System.out.print("Brand : ");
                product.setBrand(sc.nextLine());

                System.out.print("Category : ");
                product.setCategory(sc.nextLine());

                System.out.print("Model : ");
                product.setModel(sc.nextLine());

                System.out.print("Color : ");
                product.setColor(sc.nextLine());

                System.out.print("Size : ");
                product.setSize(sc.nextInt());

                System.out.print("Price : ");
                product.setPrice(sc.nextDouble());

                System.out.print("Quantity : ");
                product.setQuantity(sc.nextInt());

                System.out.println("\nProduct Updated Successfully!");
                return;
            }
        }

        System.out.println("\nProduct Not Found.");
    }

    // -------------------- DELETE PRODUCT --------------------

    public void deleteProduct() {

        if (productList.isEmpty()) {
            System.out.println("\nNo Products Available.");
            return;
        }

        System.out.print("\nEnter Product ID to Delete : ");
        int id = sc.nextInt();

        for (int i = 0; i < productList.size(); i++) {

            if (productList.get(i).getProductId() == id) {

                productList.remove(i);

                System.out.println("\nProduct Deleted Successfully!");
                return;
            }
        }

        System.out.println("\nProduct Not Found.");
    }

    // -------------------- GENERATE BILL --------------------

    public void generateBill() {

        if (productList.isEmpty()) {
            System.out.println("\nNo Products Available.");
            return;
        }

        double total = 0;

        System.out.println("\n========== BILL ==========");

        while (true) {

            System.out.print("\nEnter Product ID (0 to Finish): ");
            int id = sc.nextInt();

            if (id == 0) {
                break;
            }

            Product selectedProduct = null;

            for (Product product : productList) {

                if (product.getProductId() == id) {
                    selectedProduct = product;
                    break;
                }
            }

            if (selectedProduct == null) {
                System.out.println("Product Not Found.");
                continue;
            }

            System.out.print("Enter Quantity : ");
            int qty = sc.nextInt();

            if (qty > selectedProduct.getQuantity()) {
                System.out.println("Insufficient Stock!");
                continue;
            }

            double amount = qty * selectedProduct.getPrice();

            total += amount;

            selectedProduct.setQuantity(
                    selectedProduct.getQuantity() - qty);

            System.out.println("--------------------------------");
            System.out.println("Product : " + selectedProduct.getProductName());
            System.out.println("Qty     : " + qty);
            System.out.println("Price   : ₹" + selectedProduct.getPrice());
            System.out.println("Amount  : ₹" + amount);
            System.out.println("--------------------------------");
        }
                System.out.println("\n==================================");
        System.out.printf("TOTAL BILL : ₹%.2f%n", total);
        System.out.println("==================================");
        System.out.println("Thank you for shopping with us!");
    }

}
