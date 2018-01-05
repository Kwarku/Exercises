package exercise1;

class Order {
    private Item[] listOfItems;
    private int howManyAdded;
    private int maxSizeOfOrder;


    Order() {
        this(10);

    }

    Order(int maxSizeOfOrder) {
        this.maxSizeOfOrder = maxSizeOfOrder;
        howManyAdded = 0;
        listOfItems = new Item[maxSizeOfOrder];
    }

    void addItem(Item newItem) {
        boolean isUnique = true;
        if (howManyAdded == 0) {
            listOfItems[howManyAdded] = newItem;
            howManyAdded++;
        } else {
            for (int i = 0; i < maxSizeOfOrder; i++) {
                if (listOfItems[i] != null &&
                        listOfItems[i].getItemName().equals(newItem.getItemName())) {


                    listOfItems[i].setQuantity(listOfItems[i].getQuantity() + newItem.getQuantity());
                    isUnique = false;
                    break;
                }

            }

            if (isUnique) {
                listOfItems[howManyAdded] = newItem;
                howManyAdded++;
            }

        }


    }

    private double countOrder() {
        double totalPrice = 0;
        for (Item item : listOfItems) {
            if (item != null) {
                totalPrice += item.calculatePrice();

            } else break;
        }
        return totalPrice;
    }


    void show() {
        System.out.println("\nOrder: ");
        for (Item item : listOfItems) {
            if (item != null) {
                item.show();
                System.out.println();

            } else break;


        }
        System.out.println("Total: " + countOrder() + " zł");

    }

    void removeItem(int index) {
        listOfItems[index] = null;
        for (int i = index + 1; i < maxSizeOfOrder; i++) {

            Item temp = listOfItems[i];
            listOfItems[i - 1] = temp;
        }
        howManyAdded--;
    }

    void editItem(int index, String newName) {
        listOfItems[index].setItemName(newName);
    }

    void editItem(int index, int newQuantity) {
        listOfItems[index].setQuantity(newQuantity);
    }

    void editItem(int index, double newPrice) {
        listOfItems[index].setPrice(newPrice);
    }


}
