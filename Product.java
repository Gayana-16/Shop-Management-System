package model;

import java.io.Serializable;

public class Product implements Serializable {

    private int productId;
    private String productName;
    private String brand;
    private String category;
    private String model;
    private String color;
    private int size;
    private double price;
    private int quantity;

    // Default Constructor
    public Product() {

    }

    // Parameterized Constructor
    public Product(int productId, String productName, String brand,
                   String category, String model, String color,
                   int size, double price, int quantity) {

        this.productId = productId;
        this.productName = productName;
        this.brand = brand;
        this.category = category;
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Display Product Details
    public void displayProduct() {
        System.out.println("-------------------------------------------");
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Brand        : " + brand);
        System.out.println("Category     : " + category);
        System.out.println("Model        : " + model);
        System.out.println("Color        : " + color);
        System.out.println("Size         : " + size);
        System.out.println("Price        : ₹" + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("-------------------------------------------");
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
