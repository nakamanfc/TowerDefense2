package obj.menuInGame;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
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
                towers.forEach(g->g.removeTower(g));
            }
        });
    }
}