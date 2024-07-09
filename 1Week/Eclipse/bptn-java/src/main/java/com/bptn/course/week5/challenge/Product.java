package com.bptn.course.week5.challenge;

import java.util.ArrayList;
import java.util.List;
//Write a Java program that creates a list of products, filters the products based on their price,
// and returns the count of products whose price is less than 30000 using the Java Stream API and lambda expressions.

public class Product {
    // Create your instance variables
    int id;
    String name;
    int price ;


    // Create a constructor to initialize the product properties
    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    // Create a static method "countProducts"
    public static long  countProducts(List<Product> product) {
        return product.stream()
                .filter(tmp -> (tmp.price < 30000))
                .count();
    }

    // Filter products based on the price and get the count of products

    public static void main(String[] args) {
        // Create a list of products
        List<Product> productsList = new ArrayList<Product>();

        // Add products to the list
productsList.add(new Product(1, "HP Laptop", 25000));
productsList.add(new Product(2, "Dell Laptop", 30000));
productsList.add(new Product(3, "Lenevo Laptop", 28000));
productsList.add(new Product(4, "Sony Laptop", 28000));
productsList.add(new Product(5, "Apple Laptop", 90000));


        // Call "countProducts" method and hold return type in "count" variable

        long count =  countProducts(productsList);


        // Print the count of products whose price is less than 30000
        System.out.println("Number of products with price less than 30000: " + count);
    }
}

