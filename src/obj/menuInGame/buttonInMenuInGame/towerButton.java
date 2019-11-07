package obj.menuInGame.buttonInMenuInGame;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import obj.factory;
import obj.objInGame;
import obj.tower.Tower;

import java.util.List;

public class towerButton extends objInGame {
    private Button button = new Button() ;
    private int towerType ;
    factory factorys = new factory();

    public towerButton(String link , double x , double y, int towerType, List<Tower> towers)
    {
        setImg(new Image(link));
        setX(x);
        setY(y);
        setTowerType(towerType);
        button.setLayoutX(getX());
        button.setLayoutY(getY());
        button.setGraphic(new ImageView(getImg()));
        clickToBUtton(towers);
    }

    public void setTowerType(int towerType) {
        this.towerType = towerType;
    }

    public int getTowerType()
    {
        return towerType ;
    }

    public Button getButton() {
        return button;
    }
    public void clickToBUtton(List<Tower> towers)
    {
        switch (towerType){
            case 1:
                button.setOnMouseClicked((new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent event) {
                    }
                }));
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
        }
    }
}
