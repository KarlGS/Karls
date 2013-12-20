/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forloops;

/**
 *
 * @author apprentice
 */
public class FizzBuzz {

    public static void main(String[] args) {
        String[] counter= new String[100];
        
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
                counter[i-1]="FizzBuzz";
            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
                counter[i-1]="Fizz";
            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
                counter[i-1]="Buzz";
            } else {
//                System.out.println(i);
                counter[i-1]= String.valueOf(i);
            }
        }
        for(int i=0;i<100;i++){
            System.out.println(counter[i]);
        }
    }
}
