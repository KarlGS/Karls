/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scopedemo;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ScopeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scope example with if statements
        // age is available inside the if
        int age = 5;
        if (age < 10) {
            System.out.println(age + " is too young, you have to be 10");
        } else {
            System.out.println(age + " is ok.");
        }

        if (age < 18) {
            int diff = 18 - age;
            System.out.println("You can vote in " + diff + " years.");

        }
  
        // doesn't work diff is not available here b/c it was defined inside an if block
        // System.out.println(diff);

        for (int i = 0; i < 5; i++) {
            int constant = 2;
            System.out.println(i + constant);
        }
        // Sdoesn't work because constant was defined inside loop
        // System.out.println(constant);
        
        // exaample - the variable i can be used again in another for loop
        for(int i=4; i<45; i++){
            System.out.println(i);
        }
        
        for(int i = 0;i<23;i++){
//            for (int i =0; i<12;i++){
//          doesnt work because i was defined in outerloop      
//            }
    }
        
        
        
        // now i is deinfed outside a loop
        int i = 3;
        //this doesn't work because i was declared outside of the loop
        for( i = 0; i<10;i++){
    
    }
        //Scoping examples with methods
        Scanner sc = new Scanner(System.in);
        int age = getIntVal("Please enter age");
        System.out.println(age);
        
        
   }
    public static int getIntVal(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextInt();
    }
}
