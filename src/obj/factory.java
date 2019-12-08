package obj;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;
import obj.Enemy.enemy;
import obj.Enemy.typeEnemy;
import obj.tower.Tower;
import obj.tower.towerType;
import static main.playGame.*;
import static bruh.main.main.*;

public class factory {
    public void makeEnemy(int time , int num , typeEnemy type)
    {
        Timeline timeline = new Timeline( new KeyFrame(Duration.millis(time), event ->{
            enemys.add(creates.createEnemy(type)) ;
        }));

        timeline.setCycleCount(num);
        timeline.play();
    }
    public void makeTower(towerType type)
    {
        scene.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent mouseEvent) {
                if( type.getRetainPrice() <= moneys &&
                !(mouseEvent.getSceneX() >= 16 * canh_o_vuong && mouseEvent.getSceneX() < 21 *canh_o_vuong && mouseEvent.getSceneY() >= 0* canh_o_vuong && mouseEvent.getSceneY() < 3 * canh_o_vuong) &&
                !(mouseEvent.getSceneX() >= 12 * canh_o_vuong && mouseEvent.getSceneX() < 19 *canh_o_vuong && mouseEvent.getSceneY() >= 3* canh_o_vuong && mouseEvent.getSceneY() < 6 * canh_o_vuong) &&
                !(mouseEvent.getSceneX() >= 8 * canh_o_vuong && mouseEvent.getSceneX() < 15 *canh_o_vuong && mouseEvent.getSceneY() >= 0* canh_o_vuong && mouseEvent.getSceneY() < 3 * canh_o_vuong) &&
                !(mouseEvent.getSceneX() >= 8 * canh_o_vuong && mouseEvent.getSceneX() < 11 *canh_o_vuong && mouseEvent.getSceneY() >= 3* canh_o_vuong && mouseEvent.getSceneY() < 9 * canh_o_vuong) &&
                !(mouseEvent.getSceneX() >= 4 * canh_o_vuong && mouseEvent.getSceneX() < 9 *canh_o_vuong && mouseEvent.getSceneY() >= 6* canh_o_vuong && mouseEvent.getSceneY() < 9 * canh_o_vuong) &&
                !(mouseEvent.getSceneX() >= 4 * canh_o_vuong && mouseEvent.getSceneX() < 7 *canh_o_vuong && mouseEvent.getSceneY() >= 2* canh_o_vuong && mouseEvent.getSceneY() < 6 * canh_o_vuong) &&
                !(mouseEvent.getSceneX() >= 3 * canh_o_vuong && mouseEvent.getSceneX() < 4 *canh_o_vuong && mouseEvent.getSceneY() >= 2* canh_o_vuong && mouseEvent.getSceneY() < 5 * canh_o_vuong) &&
                !(mouseEvent.getSceneX() >= 0 * canh_o_vuong && mouseEvent.getSceneX() < 3 *canh_o_vuong && mouseEvent.getSceneY() >= 2* canh_o_vuong && mouseEvent.getSceneY() < 12 * canh_o_vuong) &&
                !(mouseEvent.getSceneX() >= 1 * canh_o_vuong && mouseEvent.getSceneX() < 4 *canh_o_vuong && mouseEvent.getSceneY() >= 9* canh_o_vuong && mouseEvent.getSceneY() < 15 * canh_o_vuong) &&
                !(mouseEvent.getSceneX() >= 1 * canh_o_vuong && mouseEvent.getSceneX() < 9 *canh_o_vuong && mouseEvent.getSceneY() >= 12* canh_o_vuong && mouseEvent.getSceneY() < 15 * canh_o_vuong) &&
                !(mouseEvent.getSceneX() >= 6 * canh_o_vuong && mouseEvent.getSceneX() < 13 *canh_o_vuong && mouseEvent.getSceneY() >= 11* canh_o_vuong && mouseEvent.getSceneY() < 14 * canh_o_vuong) &&
                !(mouseEvent.getSceneX() >= 10 * canh_o_vuong && mouseEvent.getSceneX() < 20 *canh_o_vuong && mouseEvent.getSceneY() >= 10* canh_o_vuong && mouseEvent.getSceneY() < 13 * canh_o_vuong) &&
                !(mouseEvent.getSceneX() >= 17 * canh_o_vuong && mouseEvent.getSceneX() < 21 *canh_o_vuong && mouseEvent.getSceneY() >= 12* canh_o_vuong && mouseEvent.getSceneY() < 15 * canh_o_vuong) &&
                !(mouseEvent.getSceneX() >= 21*canh_o_vuong )
                )
                {
                    boolean n = true;
                    for (Tower tower : towers) {
                        if ( (((int)((mouseEvent.getSceneX())/40))*40-12 == tower.getX() && ((int)((mouseEvent.getSceneY())/40))*40-12 == tower.getY() ))
                        {
                            n = false;
                        }
                    }
                    if (n)
                    {
                        towers.add(creates.createTower(((int)((mouseEvent.getSceneX())/40))*40-12,((int)((mouseEvent.getSceneY())/40))*40-12,type));
                        moneys = moneys - type.getRetainPrice();
                        scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
                            public void handle(MouseEvent mouseEvent) {
                            }
                        });
                    }
                }
            }
        } );
    }
}
