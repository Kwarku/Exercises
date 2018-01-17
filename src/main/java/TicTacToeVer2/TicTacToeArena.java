package TicTacToeVer2;

public abstract class TicTacToeArena implements GameArena {
    public Field[][] arena;


    @Override
    public void createArena(int xSize) {
        Integer pos;
        arena = new Field[xSize][xSize];
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < xSize; j++) {
                pos = (3 * i) + j + 1;
                arena[i][j] = Field.getField(pos.toString());
            }

        }

    }

    @Override
    public void printArena() {
        for (int i = 0; i < arena.length; i++) {
            for (int j = 0; j < arena.length; j++) {
                System.out.print(" " + arena[i][j].name + " ");
                if (j < arena.length - 1) {
                    System.out.print("|");
                }

            }
            System.out.println();
        }

        System.out.println();
    }
}
