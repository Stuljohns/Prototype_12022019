package com.example;

public class Desk extends Products {
    private int size;


    public Desk(String name, String type, String description, double price, int deskSize) {
        super(name, type, description, price);
        size = deskSize;
    }

    public int getSize() {return size;}

    public void setSize(int size) { this.size = size;}

    public String deskInfo() {
        String deskInfo;
        deskInfo = name + ", " + type + ", " + description + ", " + size + ", " + price;
        return deskInfo;
    }
}







