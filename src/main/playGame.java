package main;
import obj.Enemy.NormalEnemy;
import obj.Enemy.Tank;
import obj.Enemy.enemy;
import obj.factory;
import obj.map.drawMap;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import obj.menuInGame.menu;
import obj.tower.NormalTower;
import obj.tower.Tower;
import java.util.ArrayList;
import java.util.List;

public class playGame extends Application {
    public static final int canh_o_vuong = 40;
    public static final int sai_so_toa_do_xy = -52;
    public static GraphicsContext gc;
    public static Canvas canvas ;
    public static Group root ;
    public static Scene scene ;

    factory factorys = new factory();
    List<enemy> enemys = new ArrayList<>();
    List<Tower> towers = new ArrayList<>();
    NormalEnemy normalEnemy = new NormalEnemy();
    drawMap drawMap = new drawMap("file:src/img/map.png",0,0);
    menu menu = new menu("file:src/menuImg/menu.png",canh_o_vuong*21,canh_o_vuong*0,towers);
    NormalTower normalTower = new NormalTower(sai_so_toa_do_xy+canh_o_vuong*16,sai_so_toa_do_xy+canh_o_vuong*3);

    @Override
    public void start(Stage stage) {
        canvas = new Canvas( canh_o_vuong * 26 , canh_o_vuong * 15 );
        gc = canvas.getGraphicsContext2D();
        root = new Group() ;
        root.getChildren().addAll(canvas);
        scene = new Scene(root);
        stage.setScene(scene);
        menu.show_menu();
        action();
        factorys.makeTank(enemys);
        stage.show();

    }

    public void action ()
    {
        AnimationTimer timer = new AnimationTimer() {
            public void handle(long l) {
                drawMap.draw(gc);
                normalTower.draw(gc);
                enemys.forEach(g -> g.inGame(gc));
            }
        };
        timer.start();
    }


    public void upDate(){}

}