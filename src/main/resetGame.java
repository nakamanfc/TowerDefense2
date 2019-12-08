package main;
import static bruh.main.main.root;
import static main.playGame.*;
import static obj.menuInGame.menuGameOver.*;
public class resetGame {
    public static void resetGame()
    {
        scores = 0;
        moneys = 100;
        rounds = 0;
        hearts = 10;
        towers.clear();
        root.getChildren().removeAll(src,exit,playAgain);
    }
}
