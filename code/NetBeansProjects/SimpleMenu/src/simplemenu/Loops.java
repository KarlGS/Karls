/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simplemenu;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int counter = 0;
        
        while(counter<11){
            System.out.println(counter);
            counter++;
        }
        
        System.out.println("Please enter a number:");
        input = sc.nextInt();
       
        for(int i = 0; i<11;i++) {
            System.out.println(i);
        }
        
        while(input != 5){
            System.out.println("Please enter a number:");
            input=sc.nextInt();
            
        }
        
        System.out.println("You guessed my number!");
        
    }    
}
