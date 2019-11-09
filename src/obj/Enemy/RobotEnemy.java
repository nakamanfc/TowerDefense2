package obj.Enemy;

import javafx.scene.image.Image;

public class RobotEnemy extends enemy {
    public RobotEnemy()
{
    setImg(new Image("file:src//Default size/towerDefense_tile246.png"));
    setX(sai_so_toa_do_xy + canh_o_vuong*21);
    setY(sai_so_toa_do_xy + canh_o_vuong*2);
    setArmor(0);
    setSpeed(1);
    setHp(100);
    directional();
}
}
