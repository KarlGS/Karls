/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] wordlist = {"computer", "fantastic"};
        Scanner sc = new Scanner(System.in);
        char input;
        Random r = new Random();
        int randomword;
        String misses = "";
        String[] answers;
        char[] output;
        char[] output2;
        int counter = 0;
        int correct=0;
        randomword = (1 + r.nextInt(2)) - 1;

        output = wordlist[randomword].toCharArray();
        output2 = new char[output.length];
        for (int i = 0; i < output.length; i++) {
            output2[i] = output[i];

        }
        while (misses.length() < 6) {

            if (correct< 1) {
                for (int i = 0; i < output.length; i++) {
                    output2[i] = '-';
                }
                System.out.println(output2);
            }
            System.out.println("Give me a letter brah");
            input = sc.next().charAt(0);
            counter=0;
            
            for (int i = 0; i < output.length; i++) {
                if (input == output[i]) {
                    output2[i] = input;
                    correct=correct+1;
                } 
                

            }
            if(correct!=output.length){
                misses=misses+input;
            }
            System.out.println(output2);
            System.out.println(misses);
        }
    }
}
