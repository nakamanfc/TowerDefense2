package obj.tower;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import obj.staticObj;
import javafx.scene.input.MouseDragEvent;

public class Tower extends staticObj {
    private Image gun ;
    private towerType type ;
    private int damage ;
    private double speed_attack ;
    private double attack_range ;
    public Tower( double x , double y )
    {
        setX(x);
        setY(y);
    }
    public Tower(){}
    public void setDamage( int damage )
    {
        this.damage = damage ;
    }
    public int getDamage()
    {
        return damage ;
    }

    public void setSpeed_Attack( double speed_attack )
    {
        this.speed_attack = speed_attack ;
    }
    public double getSpeed_Attack()
    {
        return speed_attack ;
    }

    public void setAttack_range( double attack_range )
    {
        this.attack_range = attack_range ;
    }

    public double getAttack_range()
    {
        return attack_range ;
    }

    public Image getGun() {
        return gun;
    }

    public void setGun(Image gun) {
        this.gun = gun;
    }

    public void setType( towerType type )
    {
        this.type = type;
    }

    public towerType getType()
    {
        return type;
    }

    public void draw (GraphicsContext gc)
    {
        gc.drawImage(getImg(),getX(),getY());
        gc.drawImage(getGun(),getX(),getY());
    }
}
