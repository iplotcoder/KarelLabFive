


import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers;

    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }

    public void doubleBeepers()
    {
        move();
        countBeepers();
        putBeepersBack();
        move();
        placeBeepers();
        move();
    }
    
    public void countBeepers()  {
        while (nextToABeeper()) {
            pickBeeper();
            beepers ++;
        }
        
    }
    
    public void putBeepersBack()  {
        for (int x=0; x<beepers; x ++) {
            putBeeper();
        }
    }
    public void placeBeepers() {
        for (int x=0; x< 2 * beepers; x ++) {
            putBeeper();
        }
    }
}
