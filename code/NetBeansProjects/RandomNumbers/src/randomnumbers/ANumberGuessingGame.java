/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbers;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ANumberGuessingGame {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int guess;
    int number;
    
    System.out.println("I'm thinking of a number from 1 to 10.");
    System.out.println("Your guess: ");
    guess=sc.nextInt();
    number=RandomNum();
    
    if(guess==number){
        System.out.println("That's right! My secret number was "+number+"!");
    }else{
        System.out.println("Sorry, but i was really thinking of "+number+".");
    }
    
        
        
    }
    public static int RandomNum(){
    Random r = new Random();
    int i=1+r.nextInt(10);
    return i;
    
    
}
}