package obj;
import javafx.scene.image.Image;
import bruh.main.main;
import static bruh.main.main.*;

public class objInGame {
    public final int canh_o_vuong = main.canh_o_vuong ;
    private Image img ;
    private double x ;
    private double y ;
    public objInGame(String link , double x , double y)
    {
        img = new Image(link);
        this.x = x;
        this.y = y;
    }
    public objInGame(){}
    public void setImg(Image img)
    {
        this.img = img;
    }
    public void setX(double x)
    {
        this.x = x ;
    }
    public void setY(double y)
    {
        this.y = y ;
    }
    public Image getImg()
    {
        return img ;
    }
    public Double getX()
    {
        return x ;
    }
    public Double getY()
    {
        return y ;
    }
    public void draw ()
    {
        gc.drawImage(img ,x ,y);
    }
}