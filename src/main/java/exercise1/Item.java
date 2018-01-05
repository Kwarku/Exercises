package exercise1;

class Item {
    private String itemName;
    private int quantity;
    private double price;


    Item(String name, int quantity, double price) {
        setItemName(name);
        setQuantity(quantity);
        setPrice(price);

    }

    double calculatePrice() {
        return getQuantity() * getPrice();
    }

    String getItemName() {
        return itemName;
    }

    void setItemName(String itemName) {
        this.itemName = itemName;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    int getQuantity() {
        return quantity;
    }

    void setPrice(double price) {
        this.price = price;
    }

    private double getPrice() {
        return price;
    }

    void show() {
        System.out.printf("%-20s", getItemName());
        System.out.printf("%-10s", (getPrice() + " PLN"));
        System.out.printf("%4s", (getQuantity() + " pieces"));
        System.out.printf("%10s", (calculatePrice() + "PLN"));
    }


}
