/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package unitoneskillcheck;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Counter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        to10();
        System.out.println("Give me a Nth:");
        n = sc.nextInt();
        toTen(n);


    }

    public static void to10() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);

        }
    }

    public static void toTen(int number) {
        for (int i = 0; i < number + 1; i++) {
            System.out.println(i);
        }
    }
}
