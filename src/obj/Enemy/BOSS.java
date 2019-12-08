package obj.Enemy;

import javafx.scene.image.Image;
import obj.direction;

import static main.playGame.sai_so_toa_do_xy;
public class BOSS extends enemy {
    public BOSS()
    {
        setImg(new Image("file:src//Default size/tank_huge.png"));
        setX(sai_so_toa_do_xy + canh_o_vuong*21);
        setY(sai_so_toa_do_xy + canh_o_vuong*2);
        setTypeEnemy(typeEnemy.BOSS);
        setArmor(5);
        setSpeed(1);
        setHp(1000);
        directional();
    }
    @Override
    public boolean hom(double x, double y) {
        if ( x >= getX() + 7 && x <= getX() + 64 && y >= getY() + 1 && y <= getY() + 60 && ( getDirection() == obj.direction.LEFT || getDirection() == obj.direction.RIGHT ) )
            return true;
        else if ( x >= getX() + 1 && x <= getX() + 60 && y >= getY() + 7 && y <= getY() + 64 && ( getDirection() == obj.direction.UP || getDirection() == direction.DOWN ) )
            return true;
        return false;
    }
}
