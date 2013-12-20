/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboardinput;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ADumbCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double a;
        double b;
        double c;
        double d;

        System.out.println("What is your first number?");
        a = keyboard.nextDouble();
        System.out.println("What is your second number?");
        b = keyboard.nextDouble();
        System.out.println("What is your third number?");
        c = keyboard.nextDouble();
        d = (c + b + a) / 2;
        System.out.println("(" + a + " + " + b + " + " + c + ") / 2 is ... " + d);


    }
}