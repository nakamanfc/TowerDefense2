package obj.Enemy;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import obj.ObjHaveHp;
import obj.direction;

import static main.playGame.*;

public class enemy extends ObjHaveHp {
    private int turn_road = 1;
    private direction direction;
    private direction lastDirection;
    private typeEnemy typeEnemy;

    public enemy(){
        direction = obj.direction.LEFT ;
        lastDirection = obj.direction.RIGHT ;
    }

    public void setLastDirection( direction lastDirection )
    {
        this.lastDirection = lastDirection ;
    }

    public direction getLastDirection()
    {
        return lastDirection ;
    }

    public obj.direction getDirection() {
        return direction;
    }

    public void setDirection(direction direction)
    {
        this.direction = direction ;
    }

    public void directional()
    {
        SnapshotParameters params = new SnapshotParameters();
        params.setFill(Color.TRANSPARENT);
        ImageView iv = new ImageView(getImg());
        iv.setRotate(-lastDirection.getDegree() + direction.getDegree());
        setImg( iv.snapshot(params, null));
        setLastDirection(direction);
    }

    public obj.Enemy.typeEnemy getTypeEnemy() {
        return typeEnemy;
    }

    public void setTypeEnemy(obj.Enemy.typeEnemy typeEnemy) {
        this.typeEnemy = typeEnemy;
    }

    public void inGame ()
    {
        navigation();
        draw();
        move();
    }

    public void whenAttacked(boolean hitOrMiss , enemy enemy ,typeEnemy typeEnemy,int damage) {
        if (hitOrMiss){
            enemy.setHp( enemy.getHp() - damage + enemy.getArmor() );
        }
        if (enemy.getHp() <= 0)
        {
            scores = scores + typeEnemy.getReward();
            moneys = moneys + typeEnemy.getReward();
            destroys.destroyEnemy(enemy);
        }
    }

    public void move(){
        if ( direction == obj.direction.LEFT )
        {
            setX(getX() - getSpeed());
        }
        else if ( direction == obj.direction.RIGHT )
        {
            setX(getX() + getSpeed());
        }
        else if ( direction == obj.direction.DOWN )
        {
            setY(getY() + getSpeed());
        }
        else if ( direction == obj.direction.UP )
        {
            setY(getY() - getSpeed());
        }
    }

    public boolean hom(double x, double y) // hit or miss
    {
        if ( Math.sqrt(Math.pow((x - (getX() + 30)),2) + Math.pow((y - (getY() + 32)),2) ) <= 12.5)
            return true;
        return false;
    }

    public void finish(enemy enemy )
    {
        if ( enemy.getY() >= 15*canh_o_vuong )
        {
            hearts = hearts - 1;
            enemys.remove(enemy);
        }
    }

    public void navigation()
    {
        switch (turn_road) {
            case 1:
                if ( Math.abs(getX()-(sai_so_toa_do_xy + canh_o_vuong*18)) <= getSpeed() )
                {
                    setX((sai_so_toa_do_xy + canh_o_vuong*18));
                    setDirection(direction.DOWN);
                    directional();
                    turn_road++ ;
                }
                break;
            case 2:
                if ( Math.abs(getY()-(sai_so_toa_do_xy + canh_o_vuong*5)) <= getSpeed() )
                {
                    setY((sai_so_toa_do_xy + canh_o_vuong*5));
                    setDirection(direction.LEFT);
                    directional();
                    turn_road++ ;
                }
                break;
            case 3:
                if ( Math.abs(getX()-(sai_so_toa_do_xy + canh_o_vuong*14)) <= getSpeed() )
                {
                    setX((sai_so_toa_do_xy) + canh_o_vuong*14);
                    setDirection(direction.UP);
                    directional();
                    turn_road++ ;
                }
                break;
            case 4:
                if ( Math.abs(getY()-(sai_so_toa_do_xy + canh_o_vuong*2)) <= getSpeed() )
                {
                    setY((sai_so_toa_do_xy + canh_o_vuong*2));
                    setDirection(direction.LEFT);
                    directional();
                    turn_road++ ;
                }
                break;
            case 5:
                if ( Math.abs(getX()-(sai_so_toa_do_xy + canh_o_vuong*10)) <= getSpeed() )
                {
                    setX((sai_so_toa_do_xy + canh_o_vuong*10));
                    setDirection(direction.DOWN);
                    directional();
                    turn_road++ ;
                }
                break;
            case 6:
                if ( Math.abs(getY()-(sai_so_toa_do_xy + canh_o_vuong*8)) <= getSpeed() )
                {
                    setY((sai_so_toa_do_xy + canh_o_vuong*8));
                    setDirection(direction.LEFT);
                    directional();
                    turn_road++ ;
                }
                break;
            case 7:
                if ( Math.abs(getX()-(sai_so_toa_do_xy + canh_o_vuong*6)) <= getSpeed() )
                {
                    setX((sai_so_toa_do_xy + canh_o_vuong*6));
                    setDirection(direction.UP);
                    directional();
                    turn_road++ ;
                }
                break;
            case 8:
                if ( Math.abs(getY()-(sai_so_toa_do_xy + canh_o_vuong*4)) <= getSpeed() )
                {
                    setY((sai_so_toa_do_xy + canh_o_vuong*4));
                    setDirection(direction.LEFT);
                    directional();
                    turn_road++ ;
                }
                break;
            case 9:
                if ( Math.abs(getX()-(sai_so_toa_do_xy + canh_o_vuong*2)) <= getSpeed() )
                {
                    setX((sai_so_toa_do_xy + canh_o_vuong*2));
                    setDirection(direction.DOWN);
                    directional();
                    turn_road++ ;
                }
                break;
            case 10:
                if ( Math.abs(getY()-(sai_so_toa_do_xy + canh_o_vuong*11)) <= getSpeed() )
                {
                    setY((sai_so_toa_do_xy + canh_o_vuong*11));
                    setDirection(direction.RIGHT);
                    directional();
                    turn_road++ ;
                }
                break;
            case 11:
                if ( Math.abs(getX()-(sai_so_toa_do_xy + canh_o_vuong*3)) <= getSpeed() )
                {
                    setX((sai_so_toa_do_xy + canh_o_vuong*3));
                    setDirection(direction.DOWN);
                    directional();
                    turn_road++ ;
                }
                break;
            case 12:
                if ( Math.abs(getY()-(sai_so_toa_do_xy + canh_o_vuong*14)) <= getSpeed() )
                {
                    setY((sai_so_toa_do_xy + canh_o_vuong*14));
                    setDirection(direction.RIGHT);
                    directional();
                    turn_road++ ;
                }
                break;
            case 13:
                if ( Math.abs(getX()-(sai_so_toa_do_xy + canh_o_vuong*8)) <= getSpeed() )
                {
                    setX((sai_so_toa_do_xy + canh_o_vuong*8));
                    setDirection(direction.UP);
                    directional();
                    turn_road++ ;
                }
                break;
            case 14:
                if ( Math.abs(getY()-(sai_so_toa_do_xy + canh_o_vuong*13)) <= getSpeed() )
                {
                    setY((sai_so_toa_do_xy + canh_o_vuong*13));
                    setDirection(direction.RIGHT);
                    directional();
                    turn_road++ ;
                }
                break;
            case 15:
                if ( Math.abs(getX()-(sai_so_toa_do_xy + canh_o_vuong*12)) <= getSpeed() )
                {
                    setX((sai_so_toa_do_xy + canh_o_vuong*12));
                    setDirection(direction.UP);
                    directional();
                    turn_road++ ;
                }
                break;
            case 16:
                if ( Math.abs(getY()-(sai_so_toa_do_xy + canh_o_vuong*12)) <= getSpeed() )
                {
                    setY((sai_so_toa_do_xy + canh_o_vuong*12));
                    setDirection(direction.RIGHT);
                    directional();
                    turn_road++ ;
                }
                break;
            case 17:
                if ( Math.abs(getX()-(sai_so_toa_do_xy + canh_o_vuong*19)) <= getSpeed() )
                {
                    setX((sai_so_toa_do_xy + canh_o_vuong*19));
                    setDirection(direction.DOWN);
                    directional();
                    turn_road++ ;
                }
                break;
            case 18:
                if ( Math.abs(getY()-(sai_so_toa_do_xy + canh_o_vuong*14)) <= getSpeed() )
                {
                    setY((sai_so_toa_do_xy + canh_o_vuong*14));
                    setDirection(direction.RIGHT);
                    directional();
                    turn_road++ ;
                }
                break;
            case 19:
                if ( Math.abs(getX()-(sai_so_toa_do_xy + canh_o_vuong*20)) <= getSpeed() )
                {
                    setX((sai_so_toa_do_xy + canh_o_vuong*20));
                    setDirection(direction.DOWN);
                    directional();
                    turn_road++ ;
                }
                break;
        }

    }

}
