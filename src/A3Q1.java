
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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a city
        City kw = new City();

        // create a robot
        RobotSE jerrycan = new RobotSE(kw, 1, 1, Direction.EAST);

        // create some walls
        new Wall(kw, 1, 3, Direction.EAST);

        // create some things
        new Thing(kw, 1, 4);

        // jerrycan keeps going unless
        while (true) {

            if (!jerrycan.frontIsClear() || jerrycan.canPickThing()) {

                break;

            }

            jerrycan.move();
        }


    }
}