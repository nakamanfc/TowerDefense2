package obj.tower;

import javafx.scene.image.Image;

public class SlowTower extends Tower {
    public SlowTower(double x , double y)
    {
        super(x,y);
        setImg(new Image("file:src//Default size/towerDefense_tile180.png"));
        setGun(new Image("file:src//Default size/towerDefense_tile249.png"));
        setType(towerType.SLOW_GUN);
    }
}
