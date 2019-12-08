package obj.Bullet;

import javafx.scene.SnapshotParameters;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import obj.Enemy.enemy;

import static main.playGame.enemys;

public class bigRocket extends bullet {
    public bigRocket(int damage , double reloadTime , double range ,double speed)
    {
        super(damage, reloadTime, range, speed);
        setImg(new Image("file:src//Default size/towerDefense_tile252.png"));
    }
}
