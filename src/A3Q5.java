
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a city
        City kw = new City();

        // create a robot
        RobotSE jerrycan = new RobotSE(kw, 2, 3, Direction.EAST);
        
        // show a thing count
        kw.showThingCounts(true);
        
        // spawn in a stack of things
        new Thing (kw, 2, 3);
        new Thing (kw, 2, 3);
        new Thing (kw, 2, 3);
        new Thing (kw, 2, 3);
        new Thing (kw, 2, 3);
        new Thing (kw, 2, 3);
        new Thing (kw, 2, 3);
        new Thing (kw, 2, 3);
        new Thing (kw, 2, 3);
        new Thing (kw, 2, 3);
        
        
        // navigating jerrycan
        
        
        // while jerry can pick something up do the following
        while (jerrycan.canPickThing()) {
            jerrycan.pickThing();
            jerrycan.move();
            jerrycan.putThing();
            
            
            jerrycan.turnAround();
            jerrycan.move();
            jerrycan.turnAround();
            
            // if jerry can't pick something up, move forward and break (STOP)
            if (!jerrycan.canPickThing()) {
                jerrycan.move();
                        break;
            }
            
            
        
        
        
        }
        
        
    }
}
