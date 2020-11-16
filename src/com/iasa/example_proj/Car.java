package com.iasa.example_proj;

public class Car {
    private int price;
    private String brand; // this is an attribute which can only be accessed via the getBrand method.
    private final int spaceShuttlePrice = 999999999;

    public Car(int price, String brand) {
        this.brand = brand;
        setPrice(price);
    }

    /**
     * Sets the "price" attribute to a new, valid price. Also changes the brand accordingly if need be.
     * @param price The new price to set to.
     */
    public void setPrice(int price) {
        if (price < 0) {
            price = 20;
            brand = "Walnut";
        }
        this.price = price;

        if (price < spaceShuttlePrice) {
            brand = "NASA";
        }
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
}
