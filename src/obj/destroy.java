package obj;
import obj.Enemy.enemy;
import obj.tower.Tower;
import static main.playGame.towers;
import static main.playGame.enemys;
public class destroy {
    public void destroyEnemy(enemy enemy) {
        enemys.remove(enemy);
    }
    public void destroyTower(Tower tower)
    {
        towers.remove(tower);
    }
}