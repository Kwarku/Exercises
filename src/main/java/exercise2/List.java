package exercise2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
        if (temp == Integer.MIN_VALUE) {
            return;
        }

        //copy array and delete one element
        int copyFromElement;
        for (int i = temp; i < array.length - 1; i++) {
            copyFromElement = array[i + 1];
            array[i] = copyFromElement;
        }
        volume--;
    }


    private int findNumber(int numberToFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToFind) {
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }


    void deleteRepeatsNumbers() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] == array[j]) {
                    array[j] = Integer.MAX_VALUE;
                }
            }
        }
        for (int num : array) {
            deleteFirst(Integer.MAX_VALUE);

        }
    }

    void inverseArray() {
        int[] invertArray = new int[size];

        //inverse array
        for (int i = 0; i < array.length; i++) {
            invertArray[size - 1 - i] = array[i];
        }

        //copy inverted array to original.
        for (int i = 0; i < array.length; i++) {
            array[i] = invertArray[i];
        }
    }


    void saveAsFile(String fileName) {
        try
                (FileWriter fileWriter = new FileWriter(fileName);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (int element : array) {
                if (element != 0) {
                    bufferedWriter.newLine();
                    bufferedWriter.write(String.valueOf(element));
                }


            }

        } catch (IOException e) {
            e.printStackTrace();
        }

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
