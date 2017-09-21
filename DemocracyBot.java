
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public int beepers;
    
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        move();
        for (int x=0; x<5; x++) {
        checkBallot();
        nextBallot();
       }
    }
    
    public void checkBallot() {
        if (nextToABeeper()) {
            fixRooms();
        }
        else {
            cleanRooms();
        }
    }
    
    public void fixRooms() {
        turnLeft();
        move();
        if (!nextToABeeper()) {
            putBeeper();
            turnAround();
            move();
            move();
            checkBottomRoom();
        }
        else {
            turnAround();
            move();
            move();
            checkBottomRoom();
        }
    }
    
    public void checkBottomRoom()  {
        if(!nextToABeeper()) {
                putBeeper();
                turnAround();
                move();
                turnRight();
            }
            else {
                turnAround();
                move();
                turnRight();
            }
    }
    
    
    public void cleanRooms() {
        turnLeft();
        move();
        if (nextToABeeper()) {
            while(nextToABeeper()) {
            pickBeeper();
        }
        turnAround();
        move();
        move();
        cleanBottomRoom();
    }
        
        else {
            turnAround();
            move();
            move();
            cleanBottomRoom();
        }
    }
    
    public void cleanBottomRoom()  {
        if(nextToABeeper()) {
                while (nextToABeeper()) {
                pickBeeper();
            }
                turnAround();
                move();
                turnRight();
            }
            else {
                turnAround();
                move();
                turnRight();
            }
    }
    
    public void nextBallot() {
        move();
        move();
    }
    
    public void turnAround() {
        turnLeft();
        turnLeft();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
   
}

