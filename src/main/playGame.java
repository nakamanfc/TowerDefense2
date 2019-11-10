package main;
import javafx.scene.control.Button;
import obj.Enemy.NormalEnemy;
import obj.Enemy.enemy;
import obj.factory;
import obj.map.drawMap;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import obj.menuInGame.menu;
import obj.tower.Tower;
import static main.main.*;
import java.util.ArrayList;
import java.util.List;

public class playGame {
    public static List<Tower> towers = new ArrayList<>();
    public static factory factorys = new factory();
    public static List<enemy> enemys = new ArrayList<>();
    drawMap drawMap = new drawMap();
    menu menu = new menu();

    public void viewGame(Stage stage) {
        canvas = new Canvas(canh_o_vuong * 26, canh_o_vuong * 15);
        gc = canvas.getGraphicsContext2D();
        root = new Group();
        root.getChildren().addAll(canvas);
        inGame();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void inGame()
    {
        menu.show_menu();
        action();
    }

    public void action ()
    {
            AnimationTimer timer = new AnimationTimer() {
                public void handle(long l) {
                    drawMap.draw();
                    menu.draw();
                    enemys.forEach(g -> g.inGame());
                    towers.forEach(g -> g.inGame());
                }
            };
            timer.start();
    }

}