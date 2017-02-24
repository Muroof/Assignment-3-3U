
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
        RobotSE jerrycan = new RobotSE(kw, 1, 0, Direction.EAST);

        // create the things
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 3);
        new Thing(kw, 3, 5);
        new Thing(kw, 4, 6);

        // create the walls
        new Wall(kw, 6, 5, Direction.EAST);
        new Wall(kw, 5, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 3, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 1, 5, Direction.EAST);

        new Wall(kw, 5, 5, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 3, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 5, 0, Direction.SOUTH);

        new Wall(kw, 6, 0, Direction.WEST);
        new Wall(kw, 5, 0, Direction.WEST);
        new Wall(kw, 4, 0, Direction.WEST);
        new Wall(kw, 3, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 1, 0, Direction.WEST);

        new Wall(kw, 1, 0, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);




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

            }

        }


    }
}
