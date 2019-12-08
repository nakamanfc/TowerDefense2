package obj.tower;
import static bruh.main.main.gc;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;
import obj.Bullet.bullet;
import obj.Enemy.enemy;
import obj.staticObj;

import static bruh.main.main.scene;
import static main.playGame.*;
import static main.playGame.enemys;

public class Tower extends staticObj {
    private towerType type;
    private Image gun;
    private bullet bullet = new bullet();
    private int lastDegree = 0;
    public Tower( double x , double y )
    {
        setX(x);
        setY(y);
    }
    public Tower(){}

    public void setType(towerType type) {
        this.type = type;
    }

    public towerType getType() {
        return type;
    }

    public Image getGun() {
        return gun;
    }

    public void setGun(Image gun) {
        this.gun = gun;
    }

    public void setBullet(obj.Bullet.bullet bullet , double x , double y) {
        bullet.setGunLocationX(x);
        bullet.setGunLocationY(y);
        this.bullet = bullet;
    }

    public obj.Bullet.bullet getBullet() {
        return bullet;
    }

    public void drawBase()
    {
        gc.drawImage(getImg(),getX(),getY());
    }
    public void drawGun()
    {
        gc.drawImage(getGun(),getX(),getY());
    }
    public void drawBullet()
    {
        bullet.draw();
    }
    public void attack()
    {
        bullet.shoot();
        bullet.bullet_move();
        bullet.hitEnemy();
        bullet.rotateBullet();
    }

    public void rotateTower(){
        if (Math.abs(bullet.getDeltaX()) < Math.abs(bullet.getDeltaY()) && bullet.getDeltaY() < 0)
        {
            SnapshotParameters params = new SnapshotParameters();
            params.setFill(Color.TRANSPARENT);
            ImageView iv = new ImageView(getGun());
            iv.setRotate(0-lastDegree);
            setGun( iv.snapshot(params, null));
            lastDegree = 0;
        }
        else if (Math.abs(bullet.getDeltaX()) > Math.abs(bullet.getDeltaY()) && bullet.getDeltaX() > 0)
        {
            SnapshotParameters params = new SnapshotParameters();
            params.setFill(Color.TRANSPARENT);
            ImageView iv = new ImageView(getGun());
            iv.setRotate(90-lastDegree);
            setGun( iv.snapshot(params, null));
            lastDegree = 90;
        }
        else if (Math.abs(bullet.getDeltaX()) < Math.abs(bullet.getDeltaY()) && bullet.getDeltaY() > 0)
        {
            SnapshotParameters params = new SnapshotParameters();
            params.setFill(Color.TRANSPARENT);
            ImageView iv = new ImageView(getGun());
            iv.setRotate(180-lastDegree);
            setGun( iv.snapshot(params, null));
            lastDegree = 180;
        }
        else if ( Math.abs(bullet.getDeltaX()) > Math.abs(bullet.getDeltaY()) && bullet.getDeltaX() < 0 )
        {
            SnapshotParameters params = new SnapshotParameters();
            params.setFill(Color.TRANSPARENT);
            ImageView iv = new ImageView(getGun());
            iv.setRotate(270-lastDegree);
            setGun( iv.snapshot(params, null));
            lastDegree = 270;
        }
    }

    @Override
    public void draw() {
        drawBase();
        drawBullet();
        drawGun();
    }

    public void inGame()
    {
        rotateTower();
        draw();
        attack();
    }
    public void removeTower(double xx , double yy , Tower tower)
    {
        if ( xx == tower.getX() && yy == tower.getY())
        {
            moneys = moneys + type.getResellPrice();
            destroys.destroyTower(tower);
            scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent mouseEvent) {

                }
            });
        }
    }
}
