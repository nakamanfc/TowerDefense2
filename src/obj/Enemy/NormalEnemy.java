package obj.Enemy;
import javafx.scene.image.Image;

public class NormalEnemy extends enemy {
    public NormalEnemy()
    {
        setImg(new Image("file:src//Default size/towerDefense_tile248.png"));
        setX(sai_so_toa_do_xy + canh_o_vuong*19);
        setY(sai_so_toa_do_xy + canh_o_vuong*2);
        setArmor(0);
        setSpeed(1);
        setHp(100);
        directional();
    }
}