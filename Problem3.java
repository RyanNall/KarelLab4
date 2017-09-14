package KarelLab4;

 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        goToWall();
        while (!nextToABeeper()) {
        fixWall();
        }
        
        
        
    }
    public void goToWall() {
        faceNorth();
        if (frontIsClear()) {
            move();
        }
    }
    public void faceNorth() {
        if (!facingNorth()) {
            turnLeft();
        }
    }
    public void fixWall() {
        turnRight();
        if (frontIsClear()) {
        move();
        turnLeft();
              if (nextToABeeper()) {
        turnOff();
    }
        if (!frontIsClear()) {
            fixWall();
        }
        else {
            putBeeper();
            fixWall();
        }
    }
   
   else{
       
       fixWall();
   
    }
}
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
   
}

