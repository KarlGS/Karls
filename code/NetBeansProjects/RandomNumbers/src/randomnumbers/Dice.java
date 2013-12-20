/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbers;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class Dice {
    public static void main(String[] args) {
    int dice1=RandomNumber();
    int dice2=RandomNumber();
    int total=dice1+dice2;
    
    System.out.println("HERE COMES THE DICE!");
    
    System.out.println("Roll #1: "+dice1);
    System.out.println("Roll #2: "+dice2);
    
    System.out.println("The total is "+total);
    
    }
    
    public static int RandomNumber(){
        Random r = new Random();
        int rando=1+r.nextInt(6);
        return rando;
    }
}
