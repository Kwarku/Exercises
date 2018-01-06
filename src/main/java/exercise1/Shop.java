package exercise1;

public class Shop {
    public static void main(String[] args) {
        Item item = new Item("Bread", 2, 2.5);
        Item item1 = new Item("Sugar", 3, 3.25);

        Order order = new Order(20);
        order.addItem(item);
        order.addItem(item1);


        System.out.println("first list. Only bread and sugar");
        order.showOrder();


        System.out.println("\nremove bread, only sugar in list");
        order.removeItem(0);
        order.showOrder();


        System.out.print("\nagain add bread");
        order.addItem(item);
        order.showOrder();


        System.out.print("\nAgain add bread, now quantity growing");
        order.addItem(item);
        order.showOrder();

        System.out.print("\nAdd a lot of breads.");
        Item item2 = new Item("Bread", 1, 2.5);
        item2.setQuantity(15);
        order.addItem(item2);
        order.addItem(item2);

        order.showOrder();

        String fileName = "file.ser";
        Order.saveOrderToFile(order, fileName);



    }
}
