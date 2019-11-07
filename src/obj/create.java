package obj;
import obj.Enemy.BOSS;
import obj.Enemy.Tank;
import obj.Enemy.enemy;
import obj.tower.*;

public class create {
    public enemy createEnemy() {
        BOSS tank = new BOSS();
        return tank;
    }
    public Tower createTower(double x, double y , towerType type)
    {
        switch (type){
            case NORMAL_GUN:
                NormalTower normalTower = new NormalTower(x,y);
                return normalTower;
            case SLOW_GUN:
                SlowTower slowTower = new SlowTower(x,y);
                return slowTower;
            case MACHINE_GUN:
                MachineTower machineTower = new MachineTower(x,y);
                return machineTower;
            case DUAL_GUN:
                DualGunTower dualGunTower = new DualGunTower(x,y);
                return dualGunTower;
            case DOUBLE_ROCKET:
                DoubleRockerTower doubleRockerTower = new DoubleRockerTower(x,y);
                return doubleRockerTower;
            case BIG_ROCKET:
                BigRockerTower bigRockerTower = new BigRockerTower(x,y);
                return bigRockerTower;
        }
        return null ;
    }
}
