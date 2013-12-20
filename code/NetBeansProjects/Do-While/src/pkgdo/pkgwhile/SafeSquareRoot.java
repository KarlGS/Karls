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
public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double number;
        double  square;
        System.out.println("SQUARE ROOT!");
        System.out.println("Enter a number: ");
        number=sc.nextInt();
        
        while(number<0){
            System.out.println("You can't take the square root of a negative number, dummy.");
            System.out.println("Try again: ");
            number=sc.nextInt();
        }
        square = Math.sqrt(number);
        System.out.println("The square root of "+number+" is "+square+".");
        
               
    }

}
