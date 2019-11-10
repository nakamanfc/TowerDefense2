package obj.Enemy;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import static bruh.main.main.gc;

public class Tank extends enemy {
    public Image gun ;
    public Tank() {
        setImg(new Image("file:src/Default size/towerDefense_tile268.png"));
        setGun(new Image("file:src/Default size/towerDefense_tile291.png"));
        setX( sai_so_toa_do_xy + canh_o_vuong*21);
        setY(sai_so_toa_do_xy + canh_o_vuong*2);
        setArmor(0);
        setSpeed(1);
        setHp(10);
        directional();
    }
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
}
