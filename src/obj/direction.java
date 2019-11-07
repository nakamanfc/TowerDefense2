package obj;

public enum direction {
    UP(270) , DOWN(90) , LEFT(180) , RIGHT(0) ;
    int degree ;
    direction(int degree)
    {
        this.degree = degree ;
    }
    public int getDegree(){
        return degree ;
    }
}
