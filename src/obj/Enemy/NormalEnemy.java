package obj.Enemy;
import javafx.scene.image.Image;

public class NormalEnemy extends enemy {
    public NormalEnemy()
    {
        setImg(new Image("file:src//Default size/towerDefense_tile245.png"));
        setArmor(0);
        setSpeed(1);
        setHp(1);
        setX(sai_so_toa_do_xy + canh_o_vuong*21);
        setY(sai_so_toa_do_xy + canh_o_vuong*2);
        directional();
    }
}