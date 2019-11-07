package obj.tower;

import javafx.scene.image.Image;

public class DualGunTower extends Tower {
    public DualGunTower(double x , double y)
    {
        super(x,y);
        setImg(new Image("file:src//Default size/towerDefense_tile181.png"));
        setGun(new Image("file:src//Default size/towerDefense_tile250.png"));
        setAttack_range(100);
    }
}