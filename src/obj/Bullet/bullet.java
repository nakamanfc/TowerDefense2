package obj.Bullet;
import javafx.animation.Timeline;
import obj.Enemy.enemy;
import obj.moveObj;

import static main.playGame.enemys;

public class bullet extends moveObj {
    private int n = 0;
    private double damage;
    private double reloadTime;
    private double range;
    private double gunLocationX;
    private double gunLocationY;
    private double xSpeed;
    private double ySpeed;
    private double deltaX;
    private double deltaY;
    private double deltaRange;

    public bullet(double damage , double reloadTime , double range ,double speed)
    {
        setDamage(damage);
        setReloadTime(reloadTime);
        setRange(range);
        setSpeed(speed);
    }
    public bullet(){}

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getDamage() {
        return damage;
    }

    public void setReloadTime(double reloadTime) {
        this.reloadTime = reloadTime;
    }

    public double getReloadTime() {
        return reloadTime;
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

    public void setRange(double range) {
        this.range = range;
    }

    public double getRange() {
        return range;
    }

    public void resetBullet()
    {
        setX(gunLocationX);
        setY(gunLocationY);
    }

    public void shoot()
    {
        for (int i = n; i < enemys.size(); i++) {
            if(inSight(enemys.get(i)))
            {
                aim(enemys.get(i));
                bullet_move();
                break;
            }
            else{
                resetBullet();
                if ( n != enemys.size() - 1 )
                {
                    n++;
                }
                else
                    n = 0;
            }
        }
    }

    public boolean inSight(enemy enemy)
    {
        deltaX = enemy.getX()-gunLocationX;
        deltaY = enemy.getY()-gunLocationY;
        deltaRange = Math.sqrt(deltaX*deltaX+deltaY*deltaY);
        if(deltaRange <= getRange())
            return true;
        return false;
    }

    public void aim(enemy enemy)
    {
        deltaX = enemy.getX()-gunLocationX;
        deltaY = enemy.getY()-gunLocationY;
        deltaRange = Math.sqrt(deltaX*deltaX+deltaY*deltaY);
        xSpeed = deltaX*getSpeed()/deltaRange;
        ySpeed = deltaY*getSpeed()/deltaRange;
    }

    public void bullet_move()
    {
        if (Math.abs(gunLocationX - getX()) > Math.abs(deltaX) && Math.abs(gunLocationY - getY()) > Math.abs(deltaY))
        {
            resetBullet();
        }
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
    }
    public void hitEnemy()
    {
        enemys.forEach(g -> g.whenAttacked(hitOrMiss(g),g));
    }
    public boolean hitOrMiss(enemy enemy)
    {
        if ( enemy.hom(getX()+32,getY()+32)) {
            resetBullet();
            return true;
        }
        else
            return false;
    }
}