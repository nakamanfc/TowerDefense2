package obj.Enemy;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import obj.direction;

import static bruh.main.main.gc;

public class Tank extends enemy {
    public Tank() {
        setImg(new Image("file:src/Default size/towerDefense_tile268.png"));
        setGun(new Image("file:src/Default size/towerDefense_tile291.png"));
        setX( sai_so_toa_do_xy + canh_o_vuong*21);
        setY(sai_so_toa_do_xy + canh_o_vuong*2);
        setArmor(0);
        setSpeed(1);
        setHp(100);
        directional();
    }
    public Image gun ;
    public void directional()
    {
        SnapshotParameters params = new SnapshotParameters();
        params.setFill(Color.TRANSPARENT);

        ImageView iv = new ImageView(getImg());
        iv.setRotate( -getLastDirection().getDegree() + getDirection().getDegree());
        setImg(iv.snapshot(params, null));

        ImageView iv1 = new ImageView(getGun());
        iv1.setRotate( -getLastDirection().getDegree() + getDirection().getDegree());
        setGun(iv1.snapshot(params, null));
        setLastDirection(getDirection());
    }
    public void draw ()
    {
        gc.drawImage(getImg(),getX(),getY());
        gc.drawImage(getGun(),getX(),getY());
    }

    public void setGun(Image gun) {
        this.gun = gun;
    }

    public Image getGun() {
        return gun;
    }

    @Override
    public boolean hom(double x, double y) {
        if ( x >= getX() + 7 && x <= getX() + 56 && y >= getY() + 15 && y <= getY() + 48 && ( getDirection() == obj.direction.LEFT || getDirection() == direction.RIGHT ) )
            return true;
        else if ( x >= getX() + 15 && x <= getX() + 48 && y >= getY() + 7 && y <= getY() + 56 && ( getDirection() == obj.direction.UP || getDirection() == direction.DOWN ) )
            return true;
        return false;
    }
}
