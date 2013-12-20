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
public class BMICalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double height;
        double weight;
        double bmi;
        double inches;
        double lbs;
        double feet;
        
        System.out.println("Your height in m:");
        height = keyboard.nextDouble();
        System.out.println("Your weight in kg:");
        weight = keyboard.nextDouble();
        bmi = weight / (height * height);

        System.out.println("Your BMI is " + bmi);
           
        System.out.println("Your height in inches:");
        inches = keyboard.nextDouble()/39.3701;
        System.out.println("Your weight in pounds:");
        weight = keyboard.nextDouble()*.453592;
        bmi = weight / (height * height);

        System.out.println("Your BMI is " + bmi);
            
        System.out.println("Your height(feet only):");
        feet = keyboard.nextDouble()/3.28084;
        System.out.println("Your height (inches):");
        inches = keyboard.nextDouble()/39.3701;
        System.out.println("Your weight in pounds:");
        lbs =keyboard.nextDouble()*.453592;
        
        bmi = weight / ((feet+inches) *(feet+inches));

        System.out.println("Your BMI is " + bmi);
    
    }
}