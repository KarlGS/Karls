/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dogtracker;

/**
 *
 * @author apprentice
 */
public class ProgramRunner {

    public static void main(String[] args) {
        DogTracker milo = new DogTracker(3, 62);
        System.out.println("Milo: " + milo.getValues());
        DogTracker spot = milo;
        System.out.println("Spot: " + spot.getValues());
        DogTracker rover = new DogTracker(5, 33);
        System.out.println("Rover: " + rover.getValues());
        System.out.println("Milo: " + milo.getValues());

        DogTracker[] trackerArray = new DogTracker[3];
        trackerArray[0] = new DogTracker(5, 78);
        trackerArray[1] = milo;
        trackerArray[2] = rover;

        for (int i = 0; i < trackerArray.length; i++) {
            System.out.println(trackerArray[1].getValues());
        }
    }
}