/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloops;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class KeepGuessing {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int guess;
            int answer=9;
            
            System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
            System.out.println("Your guess: ");
            guess=sc.nextInt();
            
            while(guess>10||guess<1||guess!=answer){
                System.out.println("That is incorrect. Guess again.");
                guess=sc.nextInt();
            }
            
            System.out.println("That's right! You're a good guesser.");
            
            }
        

}
