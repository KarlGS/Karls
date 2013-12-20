/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AgainWNumberGuessing {
         public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int guess;
         int counter=0;
         int answer=2;
         
         System.out.println("I have a chosen a number between 1 and 10. Try to guess it");
         
        
         
         do{
             System.out.println("Your guess: ");
          guess=sc.nextInt();
          counter++;
          if (answer==guess) {
              break;
          }
          System.out.println("That is incorrect. Guess Again");          
         }while(guess!=answer);      

         
         
         System.out.println("That's right! You're a good guesser.");
         System.out.println("It only took you "+counter+" tries.");
         }
         
         
         
}


