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
public class MoreUserInputOfData {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstName;
        String lastName;
        int grade;
        int id;
        String login;
        double gpa;

        System.out.println("Please enter the following information so i can sell it for a profit!");
        System.out.println("First name: ");
        firstName = keyboard.next();
        System.out.println("Last name: ");
        lastName = keyboard.next();
        System.out.println("Grade (9-12): ");
        grade = keyboard.nextInt();
        System.out.println("Student ID: ");
        id = keyboard.nextInt();
        System.out.println("Login: ");
        login = keyboard.next();
        System.out.println("GPA (0.0-4.0: ");
        gpa = keyboard.nextDouble();

        System.out.println("Your information: ");
        System.out.println("          Login: " + login);
        System.out.println("          ID:    " + id);
        System.out.println("          Name:  " + lastName + ", " + firstName);
        System.out.println("          GPA:   " + gpa);
        System.out.println("          Grade: " + grade);
        


    }
}