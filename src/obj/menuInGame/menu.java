package obj.menuInGame;
import javafx.scene.image.Image;
import obj.menuInGame.buttonInMenuInGame.towerButton;
import obj.objInGame;
import bruh.main.main;
import obj.tower.towerType;

public class menu extends objInGame {
    play play;
    towerButton tower1;
    towerButton tower2;
    towerButton tower3;
    towerButton tower4;
    towerButton tower5;
    towerButton tower6;
    public menu() {
        setImg(new Image("file:src/menuImg/menu.png"));
        setX(canh_o_vuong*21);
        setY(canh_o_vuong*0);
        play = new play();
        tower1 = new towerButton("file:src/towerImg/normalGun.png",sai_so_toa_do_xy + canh_o_vuong*23,sai_so_toa_do_xy + canh_o_vuong*2, towerType.NORMAL_GUN);
        tower2 = new towerButton("file:src/towerImg/slowGun.png",sai_so_toa_do_xy + canh_o_vuong*25,sai_so_toa_do_xy + canh_o_vuong*2,towerType.SLOW_GUN);
        tower3 = new towerButton("file:src/towerImg/machineGun.png",sai_so_toa_do_xy + canh_o_vuong*23,sai_so_toa_do_xy + canh_o_vuong*4,towerType.MACHINE_GUN);
        tower4 = new towerButton("file:src/towerImg/dualGun.png",sai_so_toa_do_xy + canh_o_vuong*25,sai_so_toa_do_xy + canh_o_vuong*4,towerType.DUAL_GUN);
        tower5 = new towerButton("file:src/towerImg/doubleRocket.png",sai_so_toa_do_xy + canh_o_vuong*23,sai_so_toa_do_xy + canh_o_vuong*6,towerType.DOUBLE_ROCKET);
        tower6 = new towerButton("file:src/towerImg/bigRocket.png",sai_so_toa_do_xy + canh_o_vuong*25,sai_so_toa_do_xy + canh_o_vuong*6,towerType.BIG_ROCKET);
    }

    public void show_menu ()
    {
        main.root.getChildren().addAll(tower1.getButton(),tower2.getButton(),tower3.getButton(),tower4.getButton(),tower5.getButton(),tower6.getButton(),play) ;
    }
}