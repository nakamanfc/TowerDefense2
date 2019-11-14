package obj.Bullet;

import javafx.scene.image.Image;

public class machineBullet extends bullet {
    public machineBullet(double damage , double reloadTime , double range ,double speed)
    {
        super(damage, reloadTime, range, speed);
        setImg(new Image("file:src//Default size/towerDefense_tile297.png"));
    }
}
