package com.example;

public class Chair extends Products {
    public String subtype;


    public Chair(String name, String type, String description, double price, String chairSubtype) {
        super(name, type, description, price);
        subtype = chairSubtype;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {this.subtype = subtype; }

    public String chairInfo() {String chairInfo;
        chairInfo = name + ", " + type + ", " + subtype + ", " + description + ", " + price;
        return chairInfo;


    }
}
