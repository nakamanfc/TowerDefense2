package obj.Enemy;

public enum  typeEnemy {
    TANK(500) , NORMAL(10) , ROBOT(20) , SPEED(50) , BOSS(1000);
    int reward;

    typeEnemy(int reward) {
        this.reward = reward;
    }

    public int getReward() {
        return reward;
    }
}
