/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tippingcalculator;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TippingCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      double initial;
      double percent;
      double tip;
      double total;
      
      System.out.println("How much was the bill?");
      initial=sc.nextDouble();
      System.out.println("What percent would you like to tip?");
      percent=sc.nextDouble()/100;
      
      tip=initial*percent;
      total=tip+initial;
      
      System.out.println("Bill: $"+initial);
      System.out.println("Tip amount: $"+tip);
      System.out.println("Total: $"+ total);
    }
}
