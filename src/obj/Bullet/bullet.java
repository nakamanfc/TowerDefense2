package obj.Bullet;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import obj.Enemy.enemy;
import obj.moveObj;

import static main.playGame.creates;
import static main.playGame.enemys;

public class bullet extends moveObj {
    int n = 0;
    private int damage;
    private int lastDegree = 0;
    private double reloadTime;
    private double range;
    private double gunLocationX;
    private double gunLocationY;
    private double xSpeed;
    private double ySpeed;
    private double deltaX;
    private double deltaY;
    private double deltaRange;

    public bullet(int damage , double reloadTime , double range , double speed)
    {
        setDamage(damage);
        setReloadTime(reloadTime);
        setRange(range);
        setSpeed(speed);
    }
    public bullet(){}

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
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
        this.gunLocationX = gunLocationX;
    }

    public double getGunLocationY() {
        return gunLocationY;
    }

    public void setGunLocationY( double gunLocationY )
    {
        setY(gunLocationY);
        this.gunLocationY = gunLocationY;
    }

    public void setDeltaX(double deltaX) {
        this.deltaX = deltaX;
    }

    public double getDeltaX() {
        return deltaX;
    }

    public void setDeltaY(double deltaY) {
        this.deltaY = deltaY;
    }

    public double getDeltaY() {
        return deltaY;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public double getRange() {
        return range;
    }

    public void resetBullet()
    {
        n = 0;
        setX(gunLocationX);
        setY(gunLocationY);
    }

    public void shoot()
    {
        for (int i = n; i < enemys.size(); i++) {
            if(inSight(enemys.get(i)))
            {
                aim(enemys.get(i));
                break;
            }
            else{
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
        setDeltaX(enemy.getX()-gunLocationX);
        setDeltaY(enemy.getY()-gunLocationY);
        deltaRange = Math.sqrt(deltaX*deltaX+deltaY*deltaY);
        if(deltaRange <= getRange())
            return true;
        return false;
    }

    public void aim(enemy enemy)
    {
        setDeltaX(enemy.getX()-gunLocationX);
        setDeltaY(enemy.getY()-gunLocationY);
        deltaRange = Math.sqrt(deltaX*deltaX+deltaY*deltaY);
        xSpeed = deltaX*getSpeed()/deltaRange;
        ySpeed = deltaY*getSpeed()/deltaRange;
    }

    public void bullet_move()
    {
        if (Math.sqrt(Math.pow(gunLocationX - getX(),2) + Math.pow(gunLocationY - getY(),2)) > getRange())
        {
            xSpeed = 0;
            ySpeed = 0;
            resetBullet();
        }
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
    }
    public void hitEnemy()
    {
        enemys.forEach(g -> g.whenAttacked(hitOrMiss(g),g,g.getTypeEnemy(),getDamage()));
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
    public void rotateBullet()
    {
        if (Math.abs(getDeltaX()) < Math.abs(getDeltaY()) && getDeltaY() < 0)
        {
            SnapshotParameters params = new SnapshotParameters();
            params.setFill(Color.TRANSPARENT);
            ImageView iv = new ImageView(getImg());
            iv.setRotate(0-lastDegree);
            setImg( iv.snapshot(params, null));
            lastDegree = 0;
        }
        else if (Math.abs(getDeltaX()) > Math.abs(getDeltaY()) && getDeltaX() > 0)
        {
            SnapshotParameters params = new SnapshotParameters();
            params.setFill(Color.TRANSPARENT);
            ImageView iv = new ImageView(getImg());
            iv.setRotate(90-lastDegree);
            setImg( iv.snapshot(params, null));
            lastDegree = 90;
        }
        else if (Math.abs(getDeltaX()) < Math.abs(getDeltaY()) && getDeltaY() > 0)
        {
            SnapshotParameters params = new SnapshotParameters();
            params.setFill(Color.TRANSPARENT);
            ImageView iv = new ImageView(getImg());
            iv.setRotate(180-lastDegree);
            setImg( iv.snapshot(params, null));
            lastDegree = 180;
        }
        else if ( Math.abs(getDeltaX()) > Math.abs(getDeltaY()) && getDeltaX() < 0 )
        {
            SnapshotParameters params = new SnapshotParameters();
            params.setFill(Color.TRANSPARENT);
            ImageView iv = new ImageView(getImg());
            iv.setRotate(270-lastDegree);
            setImg( iv.snapshot(params, null));
            lastDegree = 270;
        }
    }
}