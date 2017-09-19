
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public int beepers;
    public boolean even;
    
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile() {
        countFirstPile();
        moveEastWest();
        pickSecondPile();
    }
    
    public void countFirstPile()  {
        while (nextToABeeper()) {
            pickBeeper();
            beepers ++;
        }
        if (beepers % 2 == 0) {
            even = true;
        }
    }
    
    public void moveEastWest()  {
        if (even == true) {
            turnRight();
            move();
        }
        else {
            turnLeft();
            move();
        }
    }
    
    public void pickSecondPile() {
        while(nextToABeeper()) {
            pickBeeper();
        }
    }
    
    public void turnRight()  {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

