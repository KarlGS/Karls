/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fiobinacciseq;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class FiobinacciSeq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input;
        
        System.out.println("Give me a number: ");
        input=sc.nextInt();
        int f = 0;
        int g =1;
        for(int i =1; i<=input;i++){
            System.out.print(f +" ");
            f=f+g;
            g=f-g;
        }
       
}
}