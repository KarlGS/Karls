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
public class CollatzSequence {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int counter=0;
        int heighest=0;
        System.out.println("Starting Number: ");
        number=sc.nextInt();
        
        do{
            counter++;
            if(number%2==0){
                number=number/2;
            }else{
                number=(number*3)+1;
                if(number>heighest)
                    heighest=number;
            }
            System.out.println(number);
        }while(number!=1);
                    System.out.println("It only took "+counter+" tries.");
                    System.out.println("It was at its heighest at " + heighest);

            }
        }
     
     

