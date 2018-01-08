package exercise2;

public class Main {
    public static void main(String[] args) {
        List array1 = new List();
        array1.addElement(5);
        array1.addElement(1);
        array1.addElement(6);
        array1.addElement(2);
        array1.addElement(7);
        array1.addElement(8);
        array1.addElement(53);
        array1.addElement(58);
        array1.addElement(221);
//        array1.addElement(31);
//        array1.addElement(312);

        array1.showInfo();


        array1.findElement(2);

        System.out.println("\nI want delete 6 ");
        array1.deleteFirst(6);
        array1.showInfo();


    }

}
