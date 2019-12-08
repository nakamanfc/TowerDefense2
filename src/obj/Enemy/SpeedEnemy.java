package obj.Enemy;

import javafx.scene.image.Image;
import static main.playGame.sai_so_toa_do_xy;
public class SpeedEnemy extends enemy {
    public SpeedEnemy()
    {
        setImg(new Image("file:src//Default size/towerDefense_tile247.png"));
        setX(sai_so_toa_do_xy + canh_o_vuong*21);
        setY(sai_so_toa_do_xy + canh_o_vuong*2);
        setTypeEnemy(typeEnemy.SPEED);
        setArmor(1);
        setSpeed(2);
        setHp(75);
        directional();
    }
}
