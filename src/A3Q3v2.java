
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A3Q3v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a city
        City kw = new City();

        // create a robot
        RobotSE jerrycan = new RobotSE(kw, 1, 1, Direction.EAST);

        // create the things
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 3);
        new Thing(kw, 3, 5);
        new Thing(kw, 2, 3);

        // create the walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 5, Direction.EAST);
        
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 5, Direction.SOUTH);




        while (jerrycan.frontIsClear()) {

            jerrycan.pickAllThings();
            jerrycan.move();



            if (!jerrycan.frontIsClear() && jerrycan.isFacingNorth()) {

                jerrycan.turnRight();
                if (!jerrycan.frontIsClear()) {
                    jerrycan.turnAround();


                }

            }
            if (!jerrycan.frontIsClear() && jerrycan.isFacingEast()) {

                jerrycan.turnRight();
                jerrycan.pickAllThings();

                if (jerrycan.frontIsClear()) {

                    jerrycan.move();
                    jerrycan.pickAllThings();
                    jerrycan.turnRight();

                } else if (!jerrycan.frontIsClear()) {
                    jerrycan.turnAround();
                    jerrycan.pickAllThings();
                }
            }

            if (!jerrycan.frontIsClear() && jerrycan.isFacingWest()) {

                jerrycan.turnLeft();
                jerrycan.pickAllThings();
                if (jerrycan.frontIsClear()) {

                    jerrycan.pickAllThings();
                    jerrycan.move();
                    jerrycan.turnLeft();
                } else if (!jerrycan.frontIsClear()) {
                    jerrycan.turnAround();
                    jerrycan.pickAllThings();


                }
                if (jerrycan.getAvenue() == 0 && jerrycan.getStreet() == 1) {
                break;
                
                
            }  


            }
            


         
        }


    }
}
