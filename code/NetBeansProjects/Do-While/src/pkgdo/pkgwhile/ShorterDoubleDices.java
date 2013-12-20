/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdo.pkgwhile;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ShorterDoubleDices {
    public static void main(String[] args) {
    int dice1;
    int dice2;
    int sum;
    
    System.out.println("HERE COMES THE DICE!");
    
    do{
        dice1=Random();
        dice2=Random();
        System.out.println("Roll #1: "+dice1);
        System.out.println("Roll #2: "+dice2);
        sum=dice1+dice2;
        System.out.println("The total is "+sum);
    }while(dice1!=dice2);
        
    
    }
    public static int Random(){
        Random r = new Random();
        int dice = 1+r.nextInt(6);
        return dice;
    }
}
