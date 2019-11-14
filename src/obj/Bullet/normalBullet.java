package obj.Bullet;

import javafx.scene.image.Image;

public class normalBullet extends bullet {
    public normalBullet(double damage , double reloadTime , double range ,double speed)
    {
        super(damage, reloadTime, range, speed);
        setImg(new Image("file:src//Default size/towerDefense_tile272.png"));
    }
}
