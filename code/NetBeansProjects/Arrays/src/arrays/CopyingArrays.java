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
public class CopyingArrays {
        public static void main(String[] args) {
        Random r = new Random();
        int num;
        int[] array= new int[10];
        int[] array2=new int[10];
     
        for(int i=0;i<10;i++){
            num=1+r.nextInt(100);
            array[i]=num;
            
        }
      
        
       
        
        
        
        for(int i=0;i<10;i++){
        array2[i]=array[i];
        
        }
        array[9]=-7;
        
        System.out.println("Array 1: " +Arrays.toString(array));
        System.out.println("Array 2: "+Arrays.toString(array2));
}
}
