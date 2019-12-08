package obj.menuInGame;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import static bruh.main.main.scene;
import static main.playGame.towers;

public class sell extends Button {
    public sell()
    {
        setText("SELL");
        setLayoutX(920);
        setLayoutY(450);
        clickToSell();
    }
    public void clickToSell()
    {
        setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        double x = ((int)((mouseEvent.getSceneX())/40))*40-12;
                        double y = ((int)((mouseEvent.getSceneY())/40))*40-12;
                        towers.forEach(g -> g.removeTower(x,y,g));
                    }
                });
            }
        });
    }
}