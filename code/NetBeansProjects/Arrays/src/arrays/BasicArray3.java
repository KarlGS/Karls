/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class BasicArray3 {
        public static void main(String[] args) {
        Random r = new Random();
        int num;
        int[] basic= new int[1000];
        for(int i=0;i<1000;i++){
            num=(r.nextInt(90)+10);
            basic[i]=num;
           System.out.print(" "+basic[i]+" ");
           
           
        }
       
                
        
        }
}
