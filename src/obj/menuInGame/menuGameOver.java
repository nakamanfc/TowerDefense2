package obj.menuInGame;


import bruh.main.main;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import obj.objInGame;

import static bruh.main.main.*;
import static main.playGame.*;
import static main.resetGame.resetGame;
public class menuGameOver {
    public static Text src = new Text();
    public static Button exit = new Button();
    public static Button playAgain = new Button();
    public menuGameOver()
    {
        src.setLayoutX(10*canh_o_vuong);
        src.setLayoutY(6*canh_o_vuong);
        src.setScaleX(3);
        src.setScaleY(3);
        exit.setText("EXIT");
        exit.setLayoutX(13*canh_o_vuong);
        exit.setLayoutY(8*canh_o_vuong);
        playAgain.setText("PLAY AGAIN");
        playAgain.setLayoutX(10*canh_o_vuong);
        playAgain.setLayoutY(8*canh_o_vuong);
        exit.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                stage1.close();
            }
        }));
        playAgain.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                resetGame();
            }
        }));
    }
    public void gameOver()
    {
            src.setText("YOUR SCORES " + scores);
            root.getChildren().addAll(src,exit,playAgain);
    }

}
