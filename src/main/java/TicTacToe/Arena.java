package TicTacToe;

class Arena {
    private static final int SIZE_OF_AREA = 3;
    private static final int MAX_SIZE_OF_AREA = 9;
    private static final char EMPTY_SIGN = ' ';
    public boolean isWin = false;
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


    public void move(int x, int y, char sign) {
        if (moves <= MAX_SIZE_OF_AREA && !checkIsGameWin(sign)) {
            if (arena[x][y] == EMPTY_SIGN) {
                arena[x][y] = sign;
                moves++;
            } else {
                System.out.println("This location is taken");
            }

            printArena();

            if (checkIsGameWin(sign)) {
                System.out.println("Player " + sign + " Win this game");
            }

        } else {
            System.out.println("Nobody win this game, please try again");
        }

    }


    private boolean checkIsGameWin(char sign) {
        if (checkIsColumnWin(sign)) {
            isWin = true;
            return true;
        } else if (checkIsRowWin(sign)) {
            isWin = true;
            return true;
        } else if (checkIsDiagonalWin(sign)) {
            isWin = true;
            return true;
        } else return false;
    }

    private boolean checkIsRowWin(char sign) {

        for (int i = 0; i < arena.length; i++) {
            if (arena[i][0] == sign &&
                    arena[i][1] == sign &&
                    arena[i][2] == sign &&
                    arena[i][i] != EMPTY_SIGN) {
                return true;
            }
        }

        return false;
    }

    private boolean checkIsColumnWin(char sign) {

        for (int i = 0; i < arena.length; i++) {
            if (arena[0][i] == sign &&
                    arena[1][i] == sign &&
                    arena[2][i] == sign &&
                    arena[i][i] != EMPTY_SIGN) {
                return true;
            }
        }

        return false;
    }

    private boolean checkIsDiagonalWin(char sign) {
        if (arena[0][0] == sign && arena[1][1] == sign && arena[2][2] == sign) {
            return true;
        } else return false;

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
