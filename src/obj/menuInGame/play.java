package obj.menuInGame;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import static main.playGame.factorys;
import static main.playGame.enemys;

public class play extends Button {
    public play()
    {
        setText("PLAY");
        setLayoutX(920);
        setLayoutY(400);
        clickToStart();
    }
    public void clickToStart()
    {
        setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                factorys.makeTank(enemys);
            }
        });
    }
}
