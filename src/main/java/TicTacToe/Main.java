package TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arena arena = new Arena();


        while (!arena.isWin) {
            arena.move(scanner.nextInt(), scanner.nextInt(), scanner.next().charAt(0));

        }
    }
}
