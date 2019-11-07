package obj;

public class ObjHaveHp extends moveObj {
    private int hp ;
    private int armor ;
    public ObjHaveHp(){}
    public void setHp(int hp)
    {
        this.hp = hp;
    }
    public void setArmor(int armor)
    {
        this.armor = armor;
    }

    public int getHp() {
        return hp;
    }
    public int getArmor()
    {
        return armor;
    }
}
