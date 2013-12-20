/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karl.triangleui;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TriangleConsoleIO {
    

    private Scanner sc = new Scanner(System.in);

    public void print(String msg) {
        System.out.println(msg);
    }
    
    //gets the side lengths
    //and ensures a positive integer is given
    public int readInt(String prompt) {
        boolean badInput;
        int result = 0;
        do {
            try {
                System.out.println(prompt);
                result = sc.nextInt();
                badInput = false;
            } catch (InputMismatchException ime) {
                badInput = true;
                sc.nextLine();
            }
        } while (badInput||result<1);
        return result;
    }
    
    //is used for menu selection
    public int readOption(String prompt) {
        boolean badInput;
        int result = 0;
        do {
            try {
                System.out.println(prompt);
                result = sc.nextInt();
                badInput = false;
            } catch (InputMismatchException ime) {
                badInput = true;
                sc.nextLine();
            }
        } while (badInput);
        return result;
    }
    public String readString(String prompt) {
        Scanner mySc = new Scanner(System.in);
        System.out.println(prompt);
        return mySc.nextLine();
    }
 
}
