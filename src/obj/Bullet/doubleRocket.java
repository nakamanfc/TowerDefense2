package obj.Bullet;

import javafx.scene.image.Image;

public class doubleRocket extends bullet {
    public doubleRocket(int damage , double reloadTime , double range ,double speed)
    {
        super(damage, reloadTime, range, speed);
        setImg(new Image("file:src//Default size/towerDefense_tile251.png"));
    }
}
