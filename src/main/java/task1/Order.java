package task1;

import java.io.*;

class Order implements Serializable {

    private static final long serialVersionUID = 3521966382402127876L;

    private Item[] listOfItems;
    private int numberOfAddedItems;
    private int maxSizeOfOrder;


    public Order() {
        this(10);

    }

    public Order(int maxSizeOfOrder) {
        this.maxSizeOfOrder = maxSizeOfOrder;
        numberOfAddedItems = 0;
        listOfItems = new Item[maxSizeOfOrder];
    }

    public static void saveOrderToFile(Order order, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream(fileName))) {
            oos.writeObject(order);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Order loadOrderFromFile(String fileName) {

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

    public void addItem(Item newItem) {
        boolean isUnique = true;
        if (numberOfAddedItems == 0) {
            addUniqueItem(newItem);
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
                addUniqueItem(newItem);
            }

        }


    }

    private void addUniqueItem(Item newItem) {
        listOfItems[numberOfAddedItems] = newItem;
        numberOfAddedItems++;
    }

    private double countOrder() {
        double totalPrice = 0;
        for (Item item : listOfItems) {
            if (item != null) {
                totalPrice += item.calculatePrice();
            }
        }
        return totalPrice;
    }

    public void removeItem(int index) {
        listOfItems[index] = null;
        for (int i = index + 1; i < maxSizeOfOrder; i++) {
            Item temp = listOfItems[i];
            listOfItems[i - 1] = temp;
        }
        numberOfAddedItems--;
    }

    public void editItem(int index, String newName) {
        listOfItems[index].setItemName(newName);
    }

    public void editItem(int index, int newQuantity) {
        listOfItems[index].setQuantity(newQuantity);
    }

    public void editItem(int index, double newPrice) {
        listOfItems[index].setPrice(newPrice);
    }

    public String showOrder() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nOrder: \n");
        for (Item item : listOfItems) {
            if (item != null) {
                sb.append(item.toString());
                sb.append("\n");
            }
        }
        sb.append("Total: " + countOrder() + " zł");

        return sb.toString();
    }
}
