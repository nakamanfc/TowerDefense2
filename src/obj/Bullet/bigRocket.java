package obj.Bullet;

import javafx.scene.image.Image;

public class bigRocket extends bullet {
    public bigRocket(double damage , double reloadTime , double range ,double speed)
    {
        super(damage, reloadTime, range, speed);
        setImg(new Image("file:src//Default size/towerDefense_tile252.png"));
    }
}
