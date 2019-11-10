package bruh.main;

import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import main.playGame;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class main extends Application {
    public static final int canh_o_vuong = 40;
    public static GraphicsContext gc;
    public static Canvas canvas;
    public static Group root;
    public static Scene scene;
    @Override
    public void start(Stage stage) {
        Button button = new Button();
        button.setPrefSize(200,100);
        button.setLayoutX(50);
        button.setLayoutY(50);
        button.setStyle("-fx-background-image: url('img/Start.png')");

        canvas = new Canvas(canh_o_vuong * 26, canh_o_vuong * 15);
        gc = canvas.getGraphicsContext2D();
        gc.drawImage(new Image("img/BG.png"),0,0);
        root = new Group();

        button.setOnMouseClicked(e->{
            playGame playGame = new playGame();
            playGame.viewGame(stage);
        });

        Button button1 = new Button("Exit");
        button1.setStyle("-fx-background-image: url('img/Exit.png')");
        button1.setPrefSize(200,100);
        button1.setLayoutY(200);
        button1.setLayoutX(50);

                button1.setOnMouseClicked(e->{
                    stage.close();
                });
        root.getChildren().addAll(canvas,button,button1);
        stage.setResizable(false);
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
