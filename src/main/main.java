package main;

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
        Button button = new Button("start");
        canvas = new Canvas(canh_o_vuong * 26, canh_o_vuong * 15);
        gc = canvas.getGraphicsContext2D();
        root = new Group();
        root.getChildren().addAll(canvas,button);
        button.setOnMouseClicked(e->{
            playGame playGame = new playGame();
            playGame.viewGame(stage);
        });
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
