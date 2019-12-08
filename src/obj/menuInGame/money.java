package obj.menuInGame;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import static bruh.main.main.canh_o_vuong;
import static main.playGame.moneys;

public class money extends Label {
    private Image coin = new Image("file:src/menuImg/coin.png",20,20,false,false);
    public money()
    {
        setText(Integer.toString(moneys));
        setGraphic(new ImageView(coin));
        setScaleX(2);
        setScaleY(2);
        setLayoutX(24*canh_o_vuong);
        setLayoutY(8*canh_o_vuong);
    }
    public void update()
    {
        setText(Integer.toString(moneys));
    }
}