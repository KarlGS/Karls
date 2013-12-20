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
public class EnterYourPin {
        public static void main(String[] args) {
        
        Scanner keyboard= new Scanner(System.in);
        int pin =12345;
        
        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.println("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();
        
        while ( entry != pin ){
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }
        
        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT");
            
            
        }
        
}
