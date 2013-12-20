/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorizer;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Factorizer {
int num;
        int total;
    /**
     * @param args the command line arguments
     */

    public void execute(){
        num= getInput("Give me a number: ");
        total=factorizer(num);        
        perfect(total, num);
        nprime(total,num);
       

    }
    public  int getInput(String message) {
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        input = sc.nextInt();
        return input;


    }

    public  int factorizer(int num) {
        int i;
        int factor;
        int total = 0;



        for (i = 1; i < num; i++) {
            if ((num % i) == 0) {
                factor = i;
                System.out.println(factor);
                total += factor;

            }
        }
        return total;
    }
    public  void perfect(int total,int num){
       if (total == num) {
            System.out.println(num + " is a perfect number");


        } 
        return;
        
    }
    public  void nprime(int total,int num){
         if (total < 2) {
            System.out.println(num + " is a prime number");
        }
         return;
    }  
}