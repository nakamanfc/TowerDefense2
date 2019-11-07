package obj.tower;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;



public class NormalTower extends Tower {
    private Image gun ;
    public NormalTower(double x , double y)
    {
        super(x,y);
        setImg(new Image("file:src//Default size/towerDefense_tile180.png"));
        setGun(new Image("file:src//Default size/towerDefense_tile226.png"));
        setAttack_range(100);
    }
    public NormalTower()
    {
        setImg(new Image("file:src//Default size/towerDefense_tile180.png"));
        setGun(new Image("file:src//Default size/towerDefense_tile226.png"));
        setAttack_range(100);
    }


    public Image getGun() {
        return gun;
    }

    public void setGun(Image gun) {
        this.gun = gun;
    }

    public void draw (GraphicsContext gc)
    {
        gc.drawImage(getImg(),getX(),getY());
        gc.drawImage(getGun(),getX(),getY());
    }
}
