package obj.tower;
import javafx.scene.image.Image;



public class NormalTower extends Tower {
    public NormalTower(double x , double y)
    {
        super(x,y);
        setImg(new Image("file:src//Default size/towerDefense_tile180.png"));
        setGun(new Image("file:src//Default size/towerDefense_tile226.png"));
        setAttack_range(100);
    }
}
