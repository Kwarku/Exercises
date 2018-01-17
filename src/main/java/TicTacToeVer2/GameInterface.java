package TicTacToeVer2;

public interface GameInterface {

    Field choosePlayer(String name);

    void move(String position);

    boolean checking();

}
