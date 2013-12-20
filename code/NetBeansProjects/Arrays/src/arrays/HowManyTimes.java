/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author apprentice
 */
public class HowManyTimes {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    Random r = new Random();
    int[] array = new int[10];
    int input;
    int times=0;
    int counter=0;
    
    for(int i =0;i<10;i++){
        num=1+r.nextInt(100);
        array[i]=num;
    }
    System.out.println("Array: "+java.util.Arrays.toString(array));
    System.out.println("Value to find: ");
    input=sc.nextInt();
    for(int i=0;i<10;i++){
        
        if(array[i]==input){
            times++;
            
        }
        counter++;
    }
    System.out.println(input+" was found "+times+" times.");
    }
}

    
    
    

