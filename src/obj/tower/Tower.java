package obj.tower;
import static bruh.main.main.gc;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import obj.Bullet.bullet;
import obj.staticObj;

import static bruh.main.main.scene;
import static main.playGame.towers;

public class Tower extends staticObj {
    private Image gun;
    private bullet bullet = new bullet();
    public Tower( double x , double y )
    {
        setX(x);
        setY(y);
    }
    public Tower(){}

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
        bullet.hitEnemy();
    }

    @Override
    public void draw() {
        drawBase();
        drawBullet();
        drawGun();
    }

    public void inGame()
    {
        draw();
        attack();
    }
    public void removeTower(Tower tower)
    {
        scene.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (((int)((mouseEvent.getSceneX())/40))*40-12 == tower.getX() && ((int)((mouseEvent.getSceneY())/40))*40-12 == tower.getY())
                {
                    towers.remove(tower);
                }
                scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent mouseEvent) {

                    }
                });
            }
        } );
    }
}
