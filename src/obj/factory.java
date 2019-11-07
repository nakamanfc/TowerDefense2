package obj;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;
import obj.Enemy.enemy;
import obj.tower.towerType;

import java.util.List;

import static main.playGame.*;

public class factory {
    create creates = new create() ;
    public void makeTank(List<enemy> enemys )
    {
        Timeline timeline = new Timeline( new KeyFrame(Duration.millis(2000), event ->{
            enemys.add(creates.createEnemy()) ;
        }));

        timeline.setCycleCount(10);
        timeline.play();
    }
    public void makeTower(towerType type)
    {
        scene.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println(mouseEvent.getSceneX()+" " +mouseEvent.getSceneY());
                System.out.println((((int)((mouseEvent.getSceneX())/40))*40)+" "+(((int)((mouseEvent.getSceneY())/40))*40));
                towers.add(creates.createTower(((int)((mouseEvent.getSceneX())/40))*40-12,((int)((mouseEvent.getSceneY())/40))*40-12,type));
                scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent mouseEvent) {

                    }
                });
            }
        } );
    }
}
