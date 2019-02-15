package com.example;

public class FilingCabinet extends Products {
    public int size;


    public FilingCabinet(String name, String type, String description, double price, int filingCabinetSize) {
        super(name, type, description, price);
        size = filingCabinetSize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {this.size = size; }

    public String filingCabinetInfo() {
        String filingCabinetInfo;
        filingCabinetInfo = name + ", " + type + ", " + size + ", " + description + ", " + price;
        return filingCabinetInfo;
    }
}