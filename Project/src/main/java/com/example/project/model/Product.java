package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    private String name;
    private double price;
    private int stock;

    public Product()
    {
        this.name = "";
        this.price = 0.0;
        this.stock = 0;
    }


    public Product(String name, double price, int stock)
    {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double newPrice)
    {
        this.price = newPrice;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int newStock)
    {
        this.stock = newStock;
    }
}
