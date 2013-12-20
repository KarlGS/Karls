/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package babyblackjack;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class BabyBlackjack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Random r = new Random();
         int card1 = RandomCard();
         int card2 = RandomCard();
         int dealercard1 = RandomCard();
         int dealercard2 = RandomCard();
         int usersum;
         int dealersum;
         
         
         System.out.println("Baby Blackjack!");
         System.out.println("You drew "+card1+" and " + card2+".");
         usersum=card1+card2;
         System.out.println("Your total is "+ usersum);
         System.out.println("The dealer has "+ dealercard1+" and "+ dealercard2+".");
         dealersum=dealercard1+dealercard2;
         System.out.println("Dealer's total is "+dealersum);
         
         if(usersum>=dealersum){
             System.out.println("YOU WIN!!!!");
         } else{
             System.out.println("YOU LOSE!!!");
         }
    }
    
    public static int RandomCard() {
             Random r = new Random();
             int selector= 1+r.nextInt(10);
             return selector;
                     
         }
    }

