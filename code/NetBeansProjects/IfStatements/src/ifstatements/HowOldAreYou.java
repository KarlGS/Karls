/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ifstatements;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HowOldAreYou {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Hey, what's your name?");
        name = sc.next();

        System.out.println("Ok, " + name +", how old are you?");
        age=sc.nextInt();
        if (age<16){
        System.out.println("You can't drive");
        System.out.println("You can't vote, "+name+".");
        System.out.println("You can't rent a car, "+name+".");
        } else if(age<18){
            System.out.println("You can't vote, "+name+".");
        System.out.println("You can't rent a car, "+name+".");
        }else if(age<25){
        System.out.println("You can't rent a car, "+name+".");
        } else {
        System.out.println("You can do anything that's legal.");
        }
        
        
                


    }


}
