package obj;
import obj.Enemy.Tank;
import obj.tower.NormalTower;

public class create {
    public Tank createTank() {
        Tank tank = new Tank();
        return tank;
    }
    public NormalTower createTower1(double x, double y)
    {
        NormalTower normalTower = new NormalTower(x,y) ;
        return normalTower ;
    }
}
