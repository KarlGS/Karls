/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package unitoneskillcheck;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class MainMethod {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input;
    
    System.out.println("Give me a number: ");
    input=sc.nextInt();
    
    System.out.println(input);
    
    for(int i =0;i<input+1;i++){
        System.out.println(i);
    }
    
    System.out.println("Thanks for playing");
    }
    
}

