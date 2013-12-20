/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author apprentice
 */
public class FindingTheLargest {
    public static void main(String[] args) {
    int[] numbers=new int[10];
    Random r = new Random();
    int max=0;
    int locater=0;
    for(int i = 0; i<10;i++){
        numbers[i]=1+r.nextInt(100);
        if(numbers[i]>max){
            max=numbers[i];
            locater=i;
        
    }
    
    }
    System.out.println("Array: " + Arrays.toString(numbers));
    System.out.println("The largest value is "+max+" at "+locater);
}
}