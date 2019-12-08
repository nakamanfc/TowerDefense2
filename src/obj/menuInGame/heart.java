package obj.menuInGame;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import static bruh.main.main.canh_o_vuong;
import static main.playGame.hearts;
import static main.playGame.*;
import static main.resetGame.*;

public class heart extends Label {
    private Image img = new Image("file:src/menuImg/heart.png",31,20,false,false);
    public heart(){
        setText(Integer.toString(hearts));
        setGraphic(new ImageView(img));
        setScaleX(2);
        setScaleY(2);
        setLayoutX(23.8*canh_o_vuong);
        setLayoutY(6.9*canh_o_vuong);
    }
    public void update()
    {
        setText(Integer.toString(hearts));
        if ( hearts == 0 )
        {
            over.gameOver();
        }
    }
}
