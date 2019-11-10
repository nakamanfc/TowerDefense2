package obj.tower;

import javafx.scene.image.Image;

public class BigRockerTower extends Tower {
    public BigRockerTower(double x , double y)
    {
        super(x,y);
        setImg(new Image("file:src//Default size/towerDefense_tile183.png"));
        setGun(new Image("file:src//Default size/towerDefense_tile206.png"));
        setType(towerType.BIG_ROCKET);
    }
}
