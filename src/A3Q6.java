
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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        // create a city
        City kw = new City();

        // create a robot
        RobotSE jerrycan = new RobotSE(kw, 1, 1, Direction.SOUTH);

        // show a thing count
        kw.showThingCounts(true);

        int counter = 0;

        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);

        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);

        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);

        new Thing(kw, 5, 1);
        new Thing(kw, 5, 1);
        new Thing(kw, 5, 1);
        new Thing(kw, 5, 1);


        // navigating jerrycan





        while (true) {
            jerrycan.move();
            counter++;


            if (jerrycan.canPickThing()) {
                jerrycan.pickAllThings();
                jerrycan.turnLeft();

                while (!jerrycan.canPickThing()) {
                    if (jerrycan.countThingsInBackpack() > 0) {
                        jerrycan.putThing();
                    }
                    jerrycan.move();

                    if (!jerrycan.canPickThing() && jerrycan.countThingsInBackpack() == 0) {
                        jerrycan.turnAround();

                        while (jerrycan.getAvenue() > 1) {
                            jerrycan.move();
                        }
                        if (jerrycan.getAvenue() == 1) {
                            jerrycan.turnLeft();
                        }


                    }




                }

            }

            if (jerrycan.getAvenue() == 1 && !jerrycan.canPickThing()) {

                break;

            }

        }
    }
}