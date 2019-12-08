package obj.tower;

import javafx.scene.image.Image;
import obj.Bullet.dualBullet;

public class DualGunTower extends Tower {
    public DualGunTower(double x , double y)
    {
        super(x,y);
        setType(towerType.DUAL_GUN);
        setImg(new Image("file:src//Default size/towerDefense_tile181.png"));
        setGun(new Image("file:src//Default size/towerDefense_tile250.png"));
        setBullet(new dualBullet(5,100,250,7),x,y);
    }
}
