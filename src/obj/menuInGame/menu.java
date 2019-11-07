package obj.menuInGame;
import obj.menuInGame.buttonInMenuInGame.towerButton;
import obj.objInGame;
import obj.tower.Tower;
import java.util.List;
import main.playGame;

public class menu extends objInGame {
    towerButton tower1;
    towerButton tower2;
    towerButton tower3;
    towerButton tower4;
    towerButton tower5;
    towerButton tower6;
    public menu(String link, double x, double y ,List<Tower> towers) {
        super(link, x, y);
        tower1 = new towerButton("file:src/towerImg/normalGun.png",sai_so_toa_do_xy + canh_o_vuong*23,sai_so_toa_do_xy + canh_o_vuong*2,1,towers);
        tower2 = new towerButton("file:src/towerImg/slowGun.png",sai_so_toa_do_xy + canh_o_vuong*25,sai_so_toa_do_xy + canh_o_vuong*2,1,towers);
        tower3 = new towerButton("file:src/towerImg/machineGun.png",sai_so_toa_do_xy + canh_o_vuong*23,sai_so_toa_do_xy + canh_o_vuong*4,1,towers);
        tower4 = new towerButton("file:src/towerImg/dualGun.png",sai_so_toa_do_xy + canh_o_vuong*25,sai_so_toa_do_xy + canh_o_vuong*4,1,towers);
        tower5 = new towerButton("file:src/towerImg/doubleRocket.png",sai_so_toa_do_xy + canh_o_vuong*23,sai_so_toa_do_xy + canh_o_vuong*6,1,towers);
        tower6 = new towerButton("file:src/towerImg/bigRocket.png",sai_so_toa_do_xy + canh_o_vuong*25,sai_so_toa_do_xy + canh_o_vuong*6,1,towers);
    }

    public void show_menu ()
    {
        playGame.root.getChildren().addAll(tower1.getButton(),tower2.getButton(),tower3.getButton(),tower4.getButton(),tower5.getButton(),tower6.getButton()) ;
        draw(playGame.gc);
    }
}