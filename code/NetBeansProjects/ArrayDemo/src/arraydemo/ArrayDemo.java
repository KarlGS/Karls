/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfElements = 0;
        int max = 0;
        int min = 0;
        int sum = 0;
        float avg = 0;
        int[] numberArray;

        System.out.println("How many numbers do you want to average?");
        numberOfElements = sc.nextInt();

        numberArray = new int[numberOfElements];
        
        for (int i = 0; i < numberOfElements; i++) {
            System.out.println("Enter your number: ");
            numberArray[i]= sc.nextInt();
            if (i == 0) {
                min = numberArray[i];
                max = numberArray[i];
            }
            if (numberArray[i] > max) {
                max = numberArray[i];
            } else if (numberArray[i] < min) {
                min = numberArray[i];
            }
            sum += numberArray[i];
        }
        avg = (float) sum / (float) numberOfElements;
        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
        System.out.println("Average value: " + avg);
        
        for(int i =0; i <numberArray.length;i++){
            System.out.println(numberArray[i]);
        
        }
    }
}
