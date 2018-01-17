package task2;

public class Main {

    private static final String EXERCISE2_FILENAME_TXT = "Exercise2.txt";

    public static void main(String[] args) {
        List array1 = new List();
        array1.addElement(5);
        array1.addElement(2);
        array1.addElement(2);
        array1.addElement(2);
        array1.addElement(7);
        array1.addElement(8);
        array1.addElement(53);
        array1.addElement(8);
        array1.addElement(8);
//        array1.addElement(31);
//        array1.addElement(312);

        array1.showInfo();


        array1.findElement(2);

        System.out.println("\nI want delete 6 ");
        array1.deleteFirst(6);
        array1.showInfo();

        System.out.println("Delete repeat");
        array1.deleteRepeatsNumbers();
        array1.showInfo();


        System.out.println("Invert array ");
        array1.inverseArray();
        array1.showInfo();


        array1.saveAsFile(EXERCISE2_FILENAME_TXT);
    }

}
