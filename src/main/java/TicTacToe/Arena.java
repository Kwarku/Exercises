package TicTacToe;

class Arena {
    private final int SIZE_OF_AREA = 3;
    private final char EMPTY_SIGN = ' ';
    boolean isWin = false;
    private int moves = 0;
    private char[][] arena;

    Arena() {
        arena = new char[SIZE_OF_AREA][SIZE_OF_AREA];
        drawXArena();
    }


    private void drawXArena() {

        for (int i = 0; i < SIZE_OF_AREA; i++) {
            for (int j = 0; j < SIZE_OF_AREA; j++) {
                arena[i][j] = EMPTY_SIGN;
            }
        }

        printMenu();
    }


    void move(int x, int y, char sign) {
        if (moves <= 9 && !isWin) {
            if (arena[x][y] == EMPTY_SIGN) {
                arena[x][y] = sign;
                moves++;
            } else {
                System.out.println("This location is taken");
            }

            printArena();
            checkIsWin(sign);

            if (isWin) {
                System.out.println("Player " + sign + " Win this game");
            }

        } else {
            System.out.println("Nobody win this game, please try again");
        }

    }

    private void checkIsWin(char sign) {
        if (arena[0][0] == sign && arena[0][1] == sign && arena[0][2] == sign) {
            isWin = true;
        } else if (arena[1][0] == sign && arena[1][1] == sign && arena[1][2] == sign) {
            isWin = true;
        } else if (arena[2][0] == sign && arena[2][1] == sign && arena[2][2] == sign) {
            isWin = true;
        } else if (arena[0][0] == sign && arena[1][0] == sign && arena[2][0] == sign) {
            isWin = true;
        } else if (arena[0][1] == sign && arena[1][1] == sign && arena[2][1] == sign) {
            isWin = true;
        } else if (arena[0][2] == sign && arena[1][2] == sign && arena[2][2] == sign) {
            isWin = true;
        } else if (arena[0][0] == sign && arena[1][1] == sign && arena[2][2] == sign) {
            isWin = true;
        }
    }

    private void printArena() {
        byte temp = 0;
        for (char[] row : arena) {
            for (char element : row) {
                System.out.print(element);
                if (temp < 2) {
                    System.out.print(" | ");
                    temp++;
                }
            }
            System.out.println();
            temp = 0;
        }
    }


    private void printMenu() {
        System.out.println("Hello user :) ");
        System.out.println("You can play in to Tic Tac Toe");
        System.out.println("Enter position x , position y and your sign (X/0 zero)");
    }


}
