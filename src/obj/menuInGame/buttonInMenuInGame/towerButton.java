package obj.menuInGame.buttonInMenuInGame;
import bruh.main.main;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import obj.objInGame;
import obj.tower.towerType;
import static main.playGame.moneys;
import static main.playGame.factorys;
import static bruh.main.main.gc;

public class towerButton extends objInGame {
    private Button button = new Button();
    private Label cost = new Label();
    private Image coin = new Image("file:src/menuImg/coin.png",10,10,false,false);
    public towerButton(String link , double x , double y, towerType type)
    {
        setImg(new Image(link));
        setX(x);
        setY(y);
        cost.setText(Integer.toString(type.getRetainPrice()));
        cost.setGraphic(new ImageView(coin));
        cost.setLayoutX(getX()+ canh_o_vuong*0.25);
        cost.setLayoutY(getY() + canh_o_vuong*2);
        cost.setScaleX(2);
        cost.setScaleY(2);
        button.setLayoutX(getX());
        button.setLayoutY(getY());
        button.setGraphic(new ImageView(getImg()));
        click(type);
    }
    public void clickToButton(towerType type)
    {
        button.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                    System.out.println(moneys);
                    factorys.makeTower(type);
            }
        }));
    }
    public Button getButton() {
        return button;
    }

    public Label getText() {
        return cost;
    }

    public void click(towerType type)
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
