package obj.tower;

import javafx.scene.SnapshotParameters;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import obj.Bullet.bigRocket;

public class BigRockerTower extends Tower {
    public BigRockerTower(double x , double y)
    {
        super(x,y);
        setType(towerType.BIG_ROCKET);
        setImg(new Image("file:src//Default size/towerDefense_tile183.png"));
        setGun(new Image("file:src//Default size/towerDefense_tile206.png"));
        setBullet(new bigRocket(100,100,500,4),x,y);
    }
}
