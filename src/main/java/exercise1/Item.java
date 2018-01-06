package exercise1;

import java.io.Serializable;

class Item implements Serializable {
    private static final int MEDIUM_SIZE = 10;
    private static final int SMALL_SIZE = 5;
    private static final int LARGE_SIZE = 20;

    private static final double SMALL_DISCOUNT = 0.05;
    private static final double MEDIUM_DISCOUNT = 0.1;
    private static final double LARGE_DISCOUNT = 0.15;
    private static final int NO_DISCOUNT = 0;

    private static final long serialVersionUID = 8700960712205571882L;

    private String itemName;
    private int quantity;
    private double price;


    Item(String name, int quantity, double price) {
        setItemName(name);
        setQuantity(quantity);
        setPrice(price);

    }

    double calculatePrice() {
        return (getQuantity() * getPrice()) * (1 - calcTheValueWithDiscount());
    }

    private double calcTheValueWithDiscount() {
        double discount = NO_DISCOUNT;
        if (getQuantity() >= SMALL_SIZE && getQuantity() < MEDIUM_SIZE) {
            //discount  5%
            discount = SMALL_DISCOUNT;
        } else if (getQuantity() >= MEDIUM_SIZE && getQuantity() < LARGE_SIZE) {
            //discount 10%
            discount = MEDIUM_DISCOUNT;
        } else if (getQuantity() >= LARGE_SIZE) {
            //discount 15%
            discount = LARGE_DISCOUNT;
        }
        return discount;
    }

    void show() {
        System.out.printf("%-20s", getItemName());
        System.out.printf("%-10s", (getPrice() + " PLN"));
        System.out.printf("%4s", (getQuantity() + " pieces"));
        System.out.printf("%10s", (calcTheValueWithDiscount() * 100 + "%"));
        System.out.printf("%10s", (calculatePrice() + "PLN"));
    }


    String getItemName() {
        return itemName;
    }

    void setItemName(String itemName) {
        this.itemName = itemName;
    }

    int getQuantity() {
        return quantity;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

}
