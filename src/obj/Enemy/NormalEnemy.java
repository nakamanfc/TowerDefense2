package obj.Enemy;
import javafx.scene.image.Image;
import static main.playGame.sai_so_toa_do_xy;
public class NormalEnemy extends enemy {
    public NormalEnemy()
    {
        setImg(new Image("file:src//Default size/towerDefense_tile245.png"));
        setArmor(0);
        setSpeed(1);
        setTypeEnemy(typeEnemy.NORMAL);
        setHp(50);
        setX(sai_so_toa_do_xy + canh_o_vuong*21);
        setY(sai_so_toa_do_xy + canh_o_vuong*2);
        directional();
    }
}