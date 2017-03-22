
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

        
        // create a counter, start at 0
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




        // while true jerry move forward, and increase counter by 1
        while (true) {
            jerrycan.move();
            counter++;

            // if jerry can pick something up, pick everything, and turn left
            if (jerrycan.canPickThing()) {
                jerrycan.pickAllThings();
                jerrycan.turnLeft();
                
                // while jerry can't pick something up and his backpack has atleast 1 item in it, place it down, otherwsie move forward
                while (!jerrycan.canPickThing()) {
                    if (jerrycan.countThingsInBackpack() > 0) {
                        jerrycan.putThing();
                    }
                    jerrycan.move();

                    // if jerrry can't pick somthing up and his backpack has nothing in it, turn around
                    if (!jerrycan.canPickThing() && jerrycan.countThingsInBackpack() == 0) {
                        jerrycan.turnAround();

                        // while jerry is on a avenue greater than 1, move
                        while (jerrycan.getAvenue() > 1) {
                            jerrycan.move();
                        }
                        
                        // once jerry is on avenue 1 turn left
                        if (jerrycan.getAvenue() == 1) {
                            jerrycan.turnLeft();
                        }


                    }




                }

            }

            // if jerry is on avenue 1 and can't pick something up, break (stop)
            if (jerrycan.getAvenue() == 1 && !jerrycan.canPickThing()) {

                break;

            }

        }
    }
}