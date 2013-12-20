/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class GradesInAnArray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name;
    String filename;
    Random r = new Random();
    int grade;
    int[] grades= new int[5];
            
    
    System.out.println("Name (first last): ");
    name=sc.next();
    
    System.out.println("Filename:" );
    filename=sc.next();
    
    System.out.println("Here are your randomly-selected grades (hope you pass)");
    for(int i =0; i<5;i++){
        grade=1+r.nextInt(100);
        System.out.println("Grade "+i+1+": "+ grade);
        grades[i]=grade;
    }
    System.out.println("Data saved in "+filename);
    }

}
