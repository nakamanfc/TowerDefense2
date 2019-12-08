package main;

import obj.Enemy.enemy;
import obj.Enemy.typeEnemy;

import static main.playGame.*;

public class round {
    public static void round(int rounds) {
        if (rounds == 1)
            factorys.makeEnemy(1000, 20, typeEnemy.NORMAL);
        else if (rounds == 2)
            factorys.makeEnemy(1000, 10, typeEnemy.SPEED);
        else if (rounds == 3)
            factorys.makeEnemy(1000, 5, typeEnemy.ROBOT);
        else if (rounds == 4)
            factorys.makeEnemy(2000, 3, typeEnemy.TANK);
        else if (rounds == 5)
            factorys.makeEnemy(1000, 1, typeEnemy.BOSS);
        else if (rounds == 6)
        {
            factorys.makeEnemy(1000, 20, typeEnemy.NORMAL);
            factorys.makeEnemy(800, 10, typeEnemy.SPEED);
            factorys.makeEnemy(1500, 5, typeEnemy.ROBOT);
            factorys.makeEnemy(2000, 3, typeEnemy.TANK);
            factorys.makeEnemy(6000, 1, typeEnemy.BOSS);
            if( enemys.isEmpty() )
                over.gameOver();
        }
    }
}