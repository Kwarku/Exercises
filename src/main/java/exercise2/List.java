package exercise2;

class List {
    private final int size;
    private int[] array;
    private int volume;

    private int temp;


    List() {
        this(10);

    }

    List(int size) {
        this.size = size;
        array = new int[size];
        volume = 0;
    }


    void addElement(int element) {
        if (volume == size) {
            System.out.println("Error: the array is full");

        } else {
            array[volume] = element;
            volume++;
        }
    }

    void findElement(int searchingElement) {
        temp = findNumber(searchingElement);

        if (array[temp] == searchingElement) {
            System.out.println("I findNumber your number ( " + searchingElement + " ) " +
                    "at " + temp + " position");
        } else {
            System.out.println("Sorry, your number ( " + searchingElement + " )" +
                    " does not exist in the list");
        }
    }


    void deleteFirst(int numberToDelete) {
        temp = findNumber(numberToDelete);
        int copyFromElement;
        volume--;

        //copy array and delete one element

        for (int i = temp; i < array.length - 1; i++) {
            copyFromElement = array[i + 1];
            array[i] = copyFromElement;
        }
    }


    private int findNumber(int numberToFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToFind) {
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }


    void showInfo() {
        System.out.println("\nList of numbers:");
        System.out.println("Size: " + size);
        System.out.println("Volume: " + volume);
        System.out.print("Elements: ");
        for (int number : array) {
            if (number != 0)
                System.out.print(number + " ");
        }
        System.out.println("\n");
    }
}
