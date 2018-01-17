package task1;

import java.io.Serializable;

public class Item implements Serializable {
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


    public Item(String name, int quantity, double price) {
        this.itemName = name;
        this.quantity = quantity;
        this.price = price;

    }

    public double calculatePrice() {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s", getItemName()));
        sb.append(String.format("%-10s", (getPrice() + " PLN")));
        sb.append(String.format("%4s", (getQuantity() + " pieces")));
        sb.append(String.format("%10s", (calcTheValueWithDiscount() * 100 + "%")));
        sb.append(String.format("%10s", (calculatePrice() + "PLN")));
        return sb.toString();
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
