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
public class KeyboardInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int age;
        String height;
        double weight;
        
        System.out.print("How old are you? ");
        age = keyboard.nextInt();
        
        System.out.print("How tall are you? ");
        height = keyboard.next();
        
        System.out.println("How much do you weigh? ");
        weight = keyboard.nextDouble();
        
        System.out.println( "So you're " + age + " old, "+ height + " tall and " + weight + " heavy.");
        
    }
}
