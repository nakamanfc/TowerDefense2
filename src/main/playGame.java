package main;
import obj.Enemy.enemy;
import obj.create;
import obj.destroy;
import obj.factory;
import obj.map.drawMap;
import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import obj.menuInGame.*;
import obj.tower.Tower;
import static bruh.main.main.*;
import java.util.ArrayList;
import java.util.List;

public class playGame {
    public static int rounds = 0 ;
    public static int scores = 0;
    public static int hearts = 10;
    public static int moneys = 5000;
    public static final int sai_so_toa_do_xy = -52;
    public static List<Tower> towers = new ArrayList<>();
    public static List<enemy> enemys = new ArrayList<>();
    public static menuGameOver over = new menuGameOver();
    public static factory factorys = new factory();
    public static destroy destroys = new destroy();
    public static create creates = new create();
    public static money money = new money();
    public static scores scoress = new scores();
    public static heart heartss = new heart();
    public static drawMap drawMap = new drawMap();
    menu menu = new menu();

    public void viewGame(Stage stage) {
        canvas = new Canvas(canh_o_vuong * 28, canh_o_vuong * 15);
        gc = canvas.getGraphicsContext2D();
        root = new Group();
        root.getChildren().addAll(canvas,money,scoress,heartss);
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
                    enemys.forEach(g -> g.finish(g));
                    towers.forEach(g -> g.inGame());
                    money.update();
                    scoress.update();
                    heartss.update();
                }
            };
            timer.start();
    }

}