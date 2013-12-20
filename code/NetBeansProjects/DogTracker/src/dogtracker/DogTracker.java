/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dogtracker;

/**
 *
 * @author apprentice
 */
public class DogTracker {
    private int age;
    private float weight;
    
    private static int howManyDogs = 0;

    public DogTracker(int howOld, float howBig){
        age = howOld;
        weight = howBig;
        howManyDogs++;
    }
    /**
     * @param args the command line arguments
     */

    public String getValues() {
        return "Age: " + age + ", Weight: " + weight + ", Total Dogs: " + howManyDogs;
    }
}