package obj.tower;

import javafx.scene.image.Image;

public class MachineTower extends Tower {
    public MachineTower(double x , double y)
    {
        super(x,y);
        setImg(new Image("file:src//Default size/towerDefense_tile181.png"));
        setGun(new Image("file:src//Default size/towerDefense_tile203.png"));
        setAttack_range(100);
    }
}
