/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterestcalc;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class interestcalcpartdeux {

        Scanner sc = new Scanner(System.in);
        double interestRate;
        double principle;
        int yearsInFund;
        double startPrinciple;
        double timesCompounded;
        double compoundedRate;
        double compoundedGain;
        double compoundedPrinciple;
        double annualInterest=0;
        double annualPrinciple;
                
                
        double compoundedInterest = 0;


        public void execute(){
        principle = getInput("What is the initial investment of principle?");
        startPrinciple = principle;
        interestRate = getInput("What is the annual interest rate?");
        timesCompounded = getInput("How many times will your interest be compounded per year?");
        yearsInFund = getInput("How many years will your investment last?");

        compoundedRate = interestRate / timesCompounded;
getInterest(yearsInFund, startPrinciple, timesCompounded, compoundedRate, compoundedInterest);

        }



    
      public  int getInput(String message) {
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        input = sc.nextInt();
        return input;


    }
      public  void getInterest(int yearsInFund,double startPrinciple,double timesCompounded,double compoundedRate,double compoundedInterest){
         double annualInterest = 0;
         double compoundedGain;
         for (int i = 1; i <= yearsInFund; i++) {
            System.out.println("Year: " + i);
            System.out.println("Starting Principle: " + startPrinciple);

            for (int s = 1; s <= (timesCompounded); s++) {
                compoundedGain = (startPrinciple * (compoundedRate / 100));
                startPrinciple = compoundedGain + startPrinciple;
                annualInterest = annualInterest + compoundedGain;



            }
            System.out.println("Interest Earned: $" + annualInterest);
            System.out.println("Principle at end of year: $" + startPrinciple);
            compoundedInterest = 0;
            annualInterest = 0;
                    
        }
         
      }
}