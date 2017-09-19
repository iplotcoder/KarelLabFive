
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    
    int beepers;
    
    
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
        while (beepers != 5) {
           countBeepers();
           faceDirection();
           nextBeeper();
           beepers = 0;
        }
    }
    
    public void countBeepers() {
        while(nextToABeeper()) {
            pickBeeper();
            beepers ++;    
        }
        
    }
    
    public void faceDirection() {
        if (beepers==1) {
                faceNorth();
            }
        else if (beepers==2) {
                faceEast();
            }
        else if (beepers==3) {
                faceSouth();
            }
        else if (beepers==4) {
                faceWest();
            }
        move();
    }
    
    public void nextBeeper() {
        while (!nextToABeeper() && beepers != 5) {
            move();
        }
    }
    
    public void faceNorth() {
        while (!facingNorth()) {
            turnLeft();
        }
    }
    
    public void faceEast() {
        while (!facingEast()) {
            turnLeft();
        }
    }
    
    public void faceSouth() {
       while (!facingSouth()) {
            turnLeft();
        }
    }
    
    public void faceWest() {
         while(!facingWest()) {
            turnLeft();
        }
    }
    
}

