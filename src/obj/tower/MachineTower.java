package obj.tower;

import javafx.scene.image.Image;
import obj.Bullet.machineBullet;

public class MachineTower extends Tower {
    public MachineTower(double x , double y)
    {
        super(x,y);
        setType(towerType.MACHINE_GUN);
        setImg(new Image("file:src//Default size/towerDefense_tile181.png"));
        setGun(new Image("file:src//Default size/towerDefense_tile203.png"));
        setBullet(new machineBullet(3,100,120,10),x,y);
    }
}
