package obj;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import obj.Enemy.enemy;
import obj.tower.Tower;

import java.util.List;

public class factory {
    create creates = new create() ;
    public void makeTank(List<enemy> enemys )
    {
        Timeline timeline = new Timeline( new KeyFrame(Duration.millis(1500), event ->{
            enemys.add(creates.createTank()) ;
        }));

        timeline.setCycleCount(20);
        timeline.play();
    }
    public void makeTower1(List<Tower>towers,double x , double y)
    {
        towers.add(creates.createTower1(x,y));
    }
}
