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
public class AgeInFiveYears {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        int five;

        System.out.println("Hello. What is your name? ");
        name = keyboard.next();
        System.out.println("Hi, " + name + "!  How old are you?");
        age = keyboard.nextInt();
        five = age + 5;
        System.out.println("Did you know that in five years you will be " + five + " years old?");
        age=age-5;
        System.out.println("And five years ago you were "+age+"! Imagine that!");

    }
}
