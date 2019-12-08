package obj.menuInGame;

import javafx.scene.text.Text;
import static main.playGame.scores;
public class scores extends Text {
    public scores()
    {
        setText(Integer.toString(scores));
        setLayoutX(9);
        setLayoutY(15);
        setScaleX(2);
        setScaleY(2);
    }
    public void update()
    {
        setText(Integer.toString(scores));
    }
}
