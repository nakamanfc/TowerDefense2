package obj.menuInGame.buttonInMenuInGame;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import obj.factory;
import obj.objInGame;
import obj.tower.towerType;

public class towerButton extends objInGame {
    private Button button = new Button() ;
    factory factorys = new factory();

    public towerButton(String link , double x , double y, towerType type)
    {
        setImg(new Image(link));
        setX(x);
        setY(y);
        button.setLayoutX(getX());
        button.setLayoutY(getY());
        button.setGraphic(new ImageView(getImg()));
        clickToBUtton(type);
    }
    public void clickToButton(towerType type)
    {
        button.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                factorys.makeTower(type);
            }
        }));
    }
    public Button getButton() {
        return button;
    }
    public void clickToBUtton(towerType type)
    {
        switch (type){
            case NORMAL_GUN:
                clickToButton(type);
            case SLOW_GUN:
                clickToButton(type);
            case MACHINE_GUN:
                clickToButton(type);
            case DUAL_GUN:
                clickToButton(type);
            case DOUBLE_ROCKET:
                clickToButton(type);
            case BIG_ROCKET:
                clickToButton(type);
        }
    }
}
