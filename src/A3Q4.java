
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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a city
        City kw = new City();

        // create a robot
        RobotSE jerrycan = new RobotSE(kw, 4, 4, Direction.SOUTH);

        // create the walls
        new Wall(kw, 6, 5, Direction.EAST);
        new Wall(kw, 5, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 1, 5, Direction.EAST);

        new Wall(kw, 6, 5, Direction.SOUTH);
        new Wall(kw, 6, 4, Direction.SOUTH);
        new Wall(kw, 6, 3, Direction.SOUTH);
        new Wall(kw, 6, 2, Direction.SOUTH);
        new Wall(kw, 6, 1, Direction.SOUTH);
        new Wall(kw, 6, 0, Direction.SOUTH);

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

        // while the front is clear, move forward jerry
        while (jerrycan.frontIsClear()) {
            jerrycan.move();

        }
        // if the front isn't clear, turn left jerry 
        while (!jerrycan.frontIsClear()) {
            jerrycan.turnLeft();
            
            // check again if the front is clear, if not turn left
            if (!jerrycan.frontIsClear()) {
                jerrycan.turnLeft();
            }
            
            // if the front is clear after initialy turning left, do the following 
            if (jerrycan.frontIsClear()) {
                jerrycan.move();
                jerrycan.turnRight();

                if (jerrycan.frontIsClear()) {
                    jerrycan.move();
                    break;


                }
            }

        }
















    }
}
