package exercise1;

import java.io.*;

class Order implements Serializable {

    private static final long serialVersionUID = 3521966382402127876L;

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

    static void saveOrderToFile(Order order, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream(fileName))) {
            oos.writeObject(order);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Order loadOrderFromFile(String fileName) {

        Order someOrder = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            someOrder = (Order) objectInputStream.readObject();


            objectInputStream.close();
        } catch (IOException e) {
            System.err.println("ERROR file does not exist");
        } catch (ClassNotFoundException e) {
            System.err.println("ERROR: class does not exist");
        }


        return someOrder;
    }

    void addItem(Item newItem) {
        boolean isUnique = true;
        if (howManyAdded == 0) {
            addItemIsUnique(newItem);
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
                addItemIsUnique(newItem);
            }

        }


    }

    private void addItemIsUnique(Item newItem) {
        listOfItems[howManyAdded] = newItem;
        howManyAdded++;
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

    void showOrder() {
        System.out.println("\nOrder: ");
        for (Item item : listOfItems) {
            if (item != null) {
                item.show();
                System.out.println();

            } else break;


        }
        System.out.println("Total: " + countOrder() + " zł");

    }
}
