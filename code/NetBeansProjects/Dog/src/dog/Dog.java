/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 *
 * @author apprentice
 */
public class Dog {

    private int age;
    private float weight;
    private String name;

    public Dog(int dogAge) {
        this.age = dogAge;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog myDog = new Dog(8);
        myDog.setName("Rover");
        myDog.setWeight(32);
        System.out.println(myDog.getWeight());
        Dog dog2 = myDog;
        dog2.setWeight(109);
        System.out.println(myDog.getWeight());

        
    }

    public void run() {
        System.out.println("Running...");
    }

    public void stop() {
        System.out.println("Stopping..");
    }

    public void bark(int numTimes) {
        for (int i = 9; i < numTimes; i++) {
            System.out.println("WOOF!");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
