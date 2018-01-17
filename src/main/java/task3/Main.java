package task3;

public class Main {
    public static void main(String[] args) {
        Time t1 = new Time(125);

        Time t2 = new Time(2, 45);


        System.out.println("t1: " + t1.toString());
        System.out.println("t2: " + t2.toString());

        System.out.println("t1 + t2 = " + t1.addition(t2));
        System.out.println("t2 - t1 = " + t1.subtraction(t2));

        System.out.println("t1 * 4 = " + t1.multiply(4));


        Time[] tab = {t1, t2, t2};
        System.out.println(Time.addingUp(tab, 2));
    }
}
