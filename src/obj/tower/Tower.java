package obj.tower;
import static main.main.gc;
import javafx.scene.image.Image;
import obj.Bullet.bullet;
import obj.staticObj;

public class Tower extends staticObj {
    private Image gun;
    private towerType type;
    private int damage;
    private double speed_attack;
    private double attack_range;
    bullet bullet = new bullet();
    public Tower( double x , double y )
    {
        setX(x);
        setY(y);
        bullet.setGunLocationX(x);
        bullet.setGunLocationY(y);
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

    public void draw ()
    {
        gc.drawImage(getImg(),getX(),getY());
        gc.drawImage(getGun(),getX(),getY());
    }

    public void attack()
    {
        bullet.bullet_move();
        bullet.draw();
        bullet.hitEnemy();
    }
    public void inGame()
    {
        draw();
        attack();
    }
}
