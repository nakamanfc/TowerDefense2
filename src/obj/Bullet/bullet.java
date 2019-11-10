package obj.Bullet;

import javafx.scene.image.Image;
import obj.Enemy.enemy;
import obj.moveObj;
import static main.playGame.enemys;

public class bullet extends moveObj {
    private bulletType type ;
    private double range ;
    private double gunLocationX ;
    private double gunLocationY ;
    public bullet()
    {
        setImg(type.getImg());
        setSpeed(type.getSpeed());
    }

    public double getGunLocationX() {
        return gunLocationX;
    }

    public void setGunLocationX( double gunLocationX )
    {
        setX(gunLocationX);
        this.gunLocationX = gunLocationX ;
    }

    public double getGunLocationY() {
        return gunLocationY;
    }

    public void setGunLocationY( double gunLocationY )
    {
        setY(gunLocationY);
        this.gunLocationY = gunLocationY;
    }

    public void resetBullet()
    {
        setX(gunLocationX);
        setY(gunLocationY);
    }

    public  void bullet_move()
    {
        if ( getX() >= gunLocationX + 100 && getY() >= gunLocationY + 100)
        {
            resetBullet();
        }
        setX(getX()+getSpeed());
        setY(getY()+getSpeed());
    }
    public void hitEnemy()
    {
        enemys.forEach(g -> g.whenAttacked(hitOrMiss(g),g));
    }
    public boolean hitOrMiss(enemy enemy)
    {
        if ( getX() > (enemy.getX()+32-20) && getX() < (enemy.getX()+32+20) && getY() > (enemy.getY()+32-20) && getY() <(enemy.getY()+32+20)) {
            resetBullet();
            return true;
        }
        else
            return false;
    }
}
