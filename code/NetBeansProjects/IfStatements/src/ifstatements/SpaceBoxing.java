/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ifstatements;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SpaceBoxing {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      double weight;
      double planet;
      double result=0;
      System.out.println("Please enter your current earth weight: ");
      weight = sc.nextInt();
      
      System.out.println("I have information for the following planets: ");
      System.out.println("\t1. Venus   2.Mars     3.Jupiter");
      System.out.println("\t4.Saturn   5.Uranus   6.Neptune");
      
      System.out.println("Which planet are you visiting?");
      planet=sc.nextInt();
      
      if(planet==1){
          result=.78*weight;
      }else if(planet==2){
          result=.39*weight;
      }else if(planet==3){
          result=2.65*weight;
      }else if(planet==4){
          result=1.17*weight;
      }else if(planet==5){
          result=1.05*weight;
      }else if(planet==6){
          result=1.23*weight;
      }else{
          System.out.println("That's not a valid planet");
      }
      
      System.out.println("Your weight would be "+result+" pounds on that planet.");
      }
      
              
      
        
        
    }
