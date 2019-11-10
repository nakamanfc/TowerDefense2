package obj.tower;

import javafx.scene.image.Image;
import obj.Bullet.doubleRocket;
import obj.Bullet.dualBullet;

public class DoubleRockerTower extends Tower {
    public DoubleRockerTower(double x , double y)
    {
        super(x,y);
        setImg(new Image("file:src//Default size/towerDefense_tile181.png"));
        setGun(new Image("file:src//Default size/towerDefense_tile205.png"));
        setBullet(new doubleRocket(),x,y);
    }
}
