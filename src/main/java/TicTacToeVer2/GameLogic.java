package TicTacToeVer2;

public interface GameLogic {

    Field choosePlayer(String name);

    void playerOneMove(String position);


    boolean checking();

}
