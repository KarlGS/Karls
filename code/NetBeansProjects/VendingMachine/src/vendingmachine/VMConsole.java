

/**
 *
 * @author apprentice
 */

    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class VMConsole {

    /**
     * @param args the command line arguments
     */
        Scanner sc=new Scanner(System.in);
        int pay;
        int select;
     
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        int cost=0;
      
        
        public int selector(){
        System.out.println("Welcome to our store");
        System.out.println("1)Pop (1.25)");
        System.out.println("2)Nachos(2.75)");
        System.out.println("3)Newports(4.50)");
        System.out.println("Select an item: ");
        select=sc.nextInt();
        return select;
        }
        public int changeBack(int select){
        System.out.println("Please insert your money:  ");
        pay=(int)(sc.nextDouble()*100);
      
        
        if(select==1){
            System.out.println("Here is your pop!");
            cost=125;
        } else if(select==2){
            System.out.println("Here is your nachos!");
            cost=275;
        } else if(select==3){
            System.out.println("Here is your newports!");
            cost=450;
        }else{
            System.out.println("Invalid input.");
        }
        
      pay=pay-cost;
       return pay;
        }
        
      public void breakDown(int changeback){
      quarters=(pay/25);
      pay=(pay%25);
      dimes=(pay/10);
      pay=(pay%10);
      nickels=(pay/5);
      pay=pay%5;
      pennies=pay;
      
      
      System.out.println("You recieve "+quarters+" quarters.");
      System.out.println("You receive "+dimes+" dimes.");
      System.out.println("You receive "+nickels+" nickels.");
      System.out.println("You receive "+pennies+" pennies.");
              
      }
}
        
        
      
                

    

