package TicTacToeVer2;

import java.util.Scanner;

public class MainTTTGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SinglePlayerGame spg = new SinglePlayerGame();
        spg.createArena(3);
        spg.printArena();

        System.out.println("choose player X or O ");
        spg.choosePlayer(scanner.next());
        while (!spg.checking()) {
            System.out.println("choose one of filed number");
            spg.playerOneMove(scanner.next());
        }

    }
}
