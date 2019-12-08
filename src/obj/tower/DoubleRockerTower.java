package obj.tower;

import javafx.scene.image.Image;
import obj.Bullet.doubleRocket;
import obj.Bullet.dualBullet;

public class DoubleRockerTower extends Tower {
    public DoubleRockerTower(double x , double y)
    {
        super(x,y);
        setType(towerType.DOUBLE_ROCKET);
        setImg(new Image("file:src//Default size/towerDefense_tile181.png"));
        setGun(new Image("file:src//Default size/towerDefense_tile205.png"));
        setBullet(new doubleRocket(50,100,350,5),x,y);
    }
}
