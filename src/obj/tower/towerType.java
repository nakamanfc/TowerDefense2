package obj.tower;


public enum towerType {
    NORMAL_GUN(50,30), SLOW_GUN(70,45), MACHINE_GUN(200,110), DUAL_GUN(400,220), DOUBLE_ROCKET(1000,550), BIG_ROCKET(2000,1100);
    int retainPrice;
    int resellPrice;
    towerType(int retainPrice,int resellPrice)
    {
        this.resellPrice = resellPrice;
        this.retainPrice = retainPrice;
    }
    public int getRetainPrice(){
        return retainPrice ;
    }
    public int getResellPrice()
    {
        return resellPrice;
    }
}