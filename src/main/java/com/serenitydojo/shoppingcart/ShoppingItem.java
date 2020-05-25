package com.serenitydojo.shoppingcart;

public class ShoppingItem {
    private final String name;
    private final String units;
    private final double price;
    private final String serialNumber;
    private final String brand;

    public ShoppingItem(String name, String units, double price, String serialNumber, String brand) {

        this.name = name;
        this.units = units;
        this.price = price;
        this.serialNumber = serialNumber;
        this.brand = brand;
    }
}
