
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
public class A3Q3 {

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
        //new Wall(kw, 4, 1, Direction.WEST);

        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 5, Direction.EAST);
        //new Wall(kw, 4, 5, Direction.EAST);

        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 5, Direction.SOUTH);

        // moving the robot

        // MAIN WHILE LOOP - While front is clear jerry move and pick up

        while (jerrycan.frontIsClear()) {
            jerrycan.move();
            jerrycan.pickAllThings();

            if (!jerrycan.frontIsClear() && jerrycan.isFacingEast()) {
                jerrycan.turnRight();

                if (!jerrycan.frontIsClear()) {
                    jerrycan.turnAround();
                    break;

                }

                jerrycan.move();
                jerrycan.turnRight();

            }

            if (!jerrycan.frontIsClear() && jerrycan.isFacingWest()) {
                jerrycan.turnLeft();

                if (!jerrycan.frontIsClear()) {
                    jerrycan.turnAround();
                    break;
                }

                jerrycan.move();
                jerrycan.turnLeft();

            }




        }

        while (jerrycan.getAvenue() > 1 && jerrycan.getStreet() == 1) {
            if (!jerrycan.frontIsClear()) {
                jerrycan.turnLeft();
            }
            jerrycan.move();

            jerrycan.turnAround();

        }


        while (jerrycan.getStreet() > 1) {

            jerrycan.move();

            if (!jerrycan.frontIsClear()) {
                jerrycan.turnLeft();
            }

            while (jerrycan.getStreet() == 1 && jerrycan.getAvenue() > 1) {
                jerrycan.move();


            }






            if (jerrycan.getAvenue() == 1 && jerrycan.getStreet() == 1) {
                jerrycan.turnAround();
                break;
            }
        }
    }
}