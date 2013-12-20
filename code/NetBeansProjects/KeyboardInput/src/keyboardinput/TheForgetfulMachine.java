/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboardinput;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TheForgetfulMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Give me a word!");
        keyboard.next();
        System.out.println("Give me a second word!");
        keyboard.next();
        
        System.out.println("Great, now your favorite number?");
        keyboard.nextInt();
        System.out.println("And your second-favorite number...");
        keyboard.nextInt();
        
        System.out.println("Whew! Wasn't that fun?");
                
        
    }

}
