package obj.tower;

import obj.Bullet.bulletType;

public enum  towerType {
    NORMAL_GUN(obj.Bullet.bulletType.NORMALBULLET),
    SLOW_GUN(obj.Bullet.bulletType.SLOWBULLET),
    MACHINE_GUN(obj.Bullet.bulletType.MACHINEBULLET),
    DUAL_GUN(obj.Bullet.bulletType.DUALBULLET),
    DOUBLE_ROCKET(obj.Bullet.bulletType.DOUBLEROCKET),
    BIG_ROCKET(obj.Bullet.bulletType.BIGROCKET);
    bulletType bulletType ;
    towerType(bulletType type)
    {
        bulletType = type;
    }

    public obj.Bullet.bulletType getBulletType() {
        return bulletType;
    }
}
