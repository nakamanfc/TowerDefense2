package obj.Bullet;

import javafx.scene.image.Image;

public enum  bulletType {
    NORMALBULLET(5 , 100 , 2 , 100 , "file:src//Default size/towerDefense_tile272.png") ,
    SLOWBULLET(5 , 100 , 2 , 100 , "file:src//Default size/towerDefense_tile275.png") ,
    MACHINEBULLET(5 , 100 , 2 , 100 , "file:src//Default size/towerDefense_tile297.png") ,
    DUALBULLET(5 , 100 , 2 , 100 , "file:src//Default size/towerDefense_tile295.png") ,
    DOUBLEROCKET(5 , 100 , 2 , 100 , "file:src//Default size/towerDefense_tile251.png") ,
    BIGROCKET(50 , 100 , 2 , 100 , "file:src//Default size/towerDefense_tile252.png") ;
    double range , damage , speed , reloadTime;
    Image image ;
    bulletType( double damage , double range , double speed , double reloadTime , String img )
    {
        this.range = range;
        this.damage = damage;
        this.speed = speed;
        this.reloadTime = reloadTime;
        this.image = new Image(img);
    }

    public double getDamage() {
        return damage;
    }

    public double getRange() {
        return range;
    }

    public double getReloadTime() {
        return reloadTime;
    }

    public double getSpeed() {
        return speed;
    }

    public Image getImg() {
        return image;
    }
}
