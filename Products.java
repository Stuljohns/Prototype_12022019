package com.example;

public class Products
{
    protected String name, type, description;
    protected double price;


    Products(String productName, String productType, String productDescription, double productPrice)
    {
        name = productName;
        type = productType;
        description = productDescription;
        price = productPrice;
    }

    public String getName() {return name;}
    public String getType() {return type;}
    public String getDescription () {return description;}
    public double getPrice () {return price;}

    public void setName(String name) {this.name = name;}
    public void setType(String type) {this.type = type;}
    public void setDescription(String description) {this.description = description;}
    public void setPrice (double price) {this.price = price;}
}