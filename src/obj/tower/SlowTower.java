package obj.tower;

import javafx.scene.image.Image;
import obj.Bullet.slowBullet;

public class SlowTower extends Tower {
    public SlowTower(double x , double y)
    {
        super(x,y);
        setImg(new Image("file:src//Default size/towerDefense_tile180.png"));
        setGun(new Image("file:src//Default size/towerDefense_tile249.png"));
        setBullet(new slowBullet(1,100,100,2),x,y);
    }
}
