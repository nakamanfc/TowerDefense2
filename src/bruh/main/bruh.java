package bruh.main;

import javafx.application.Application;
import javafx.application.Preloader;
import java.io.FileInputStream;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import main.playGame;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.InputStream;

public class bruh extends Application {
    public void start(Stage stage)
    {
        Image image = new Image("file:C:\\Users\\bruh\\IdeaProjects\\TowerDefense2\\src\\bruh\\main\\map.png");
        ImageView imv = new ImageView(image);
        imv.setX(0);
        imv.setY(0);
        stage.setTitle("Game Menu");


        Group root = new Group();
        Canvas canvas = new Canvas(840,600);
        root.getChildren().add(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        // InputStream input =
        stage.setResizable(false);


        stage.show();
    }
}
