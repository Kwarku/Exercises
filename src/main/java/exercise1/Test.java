package exercise1;

public class Test {
    public static void main(String[] args) {
        Order someTestsOrder = Order.loadOrderFromFile("file.ser");
        someTestsOrder.showOrder();

    }
}
