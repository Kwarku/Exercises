package TicTacToeVer2;

public enum Field {
    ONE(0, 0, "1"),
    TWO(0, 1, "2"),
    THREE(0, 2, "3"),
    FOUR(1, 0, "4"),
    FIVE(1, 1, "5"),
    SIX(1, 2, "6"),
    SEVEN(2, 0, "7"),
    EIGHT(2, 1, "8"),
    NINE(2, 2, "9"),
    OTHER(0, 0, " "),
    PLAYER_X(0, 0, "X"),
    PLAYER_O(0, 0, "O"),;


    int posX;
    int posY;
    String name;

    Field(int posX, int posY, String name) {
        this.posX = posX;
        this.posY = posY;
        this.name = name;
    }

    public static Field getField(String name) {
        for (Field field : Field.values()) {
            if (field.name.equals(name)) {
                return field;
            }
        }
        return OTHER;
    }

    @Override
    public String toString() {
        return name;
    }

}
