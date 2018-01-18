package TicTacToeVer2;

public class SinglePlayerGame extends TicTacToeArena implements GameLogic {


    private Field userPlayer;
    private Field tempField;


    @Override
    public Field choosePlayer(String name) {
        userPlayer = Field.getField(name);
        return userPlayer;
    }

    @Override
    public void playerOneMove(String position) {
        tempField = Field.getField(position);
        arena[tempField.posX][tempField.posY] = userPlayer;
        printArena();

    }


    @Override
    public boolean checking() {
        if (checkColumn()) {
            return true;
        } else if (checkRow()) {
            return true;
        } else if (checkCross()) {
            return true;
        }
        return false;
    }

    private boolean checkColumn() {
        int tempCol = 0;
        for (int i = 0; i < arena.length; i++) {
            for (int j = 0; j < arena.length; j++) {
                if (arena[j][i] == userPlayer) {
                    tempCol++;
                }
                if (tempCol == arena.length) {
                    return true;
                }
            }
            tempCol = 0;
        }
        return false;
    }

    private boolean checkRow() {
        int tempRow = 0;
        for (int i = 0; i < arena.length; i++) {
            for (int j = 0; j < arena.length; j++) {
                if (arena[i][j] == userPlayer) {
                    tempRow++;
                }
                if (tempRow == arena.length) {
                    return true;
                }
            }
            tempRow = 0;
        }
        return false;
    }

    private boolean checkCross() {
        int tempCross = 0;
        for (int i = 0; i < arena.length; i++) {
            if (arena[i][i] == userPlayer) {
                tempCross++;
            }
        }
        if (tempCross == arena.length) {
            return true;
        }

        return false;
    }
}
