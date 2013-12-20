/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package babyblackjack;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class BlackJackProject {
        public static void main(String[] args) {
            int card1 = RandomCard();
            int card2 = RandomCard();
            int card3;
            int dealer1=RandomCard();
            int dealer2=RandomCard();
            int dealer3;
            int usersum= card1+card2;
            int dealersum=dealer1+dealer2;
            String input;
         
            Scanner sc= new Scanner(System.in);
            System.out.println("Welcome to Mitchell's blackjack program!");
            System.out.println("You get a "+card1+" and a "+card2);
            System.out.println("Your total is "+usersum);
            if (usersum==22){
                usersum=12;
            }
            System.out.println("\nThe dealer has a "+dealer1+" showing, and a hidden card.");
            System.out.println("His total is hidden, too.");
            
            System.out.println("Would you like to 'hit' or 'stay'?");
            input=sc.next();
            
            while(input.equals("hit")){
                card3=RandomCard();
                System.out.println("You drew a "+card3);
                usersum=usersum+card3;
                System.out.println("Your total is "+ usersum);
                System.out.println("\nWould you like to  'hit' or 'stay'?");
                input="";
                      
                input=sc.next();
                
            }
            
            if (usersum>21){
               System.out.println("You busted brah.");
            }
            System.out.println("Okay, dealer's turn.");
            System.out.println("His hidden card was a "+ dealer2);
            System.out.println("His total sum was "+ dealersum);
            
            while(dealersum<=15){
                dealer3=RandomCard();
                System.out.println("Dealer chooses to hit.");
                System.out.println("He draws a "+ dealer3+".");
                dealersum+=dealer3;
                System.out.println("His total was "+dealersum);
            }
            if (dealersum>21){
                System.out.println("Dealer Busted.");
            }else{
            System.out.println("Dealer stays.");
            }
            System.out.println("Dealer total is "+dealersum);
            System.out.println("Your total is "+usersum);
            
            if(usersum>dealersum&&usersum<=21){
                System.out.println("YOU WIN!");
            } else if(dealersum>usersum&&(dealersum<22)||(usersum>21)){
                System.out.println("COMPUTER WINS");
            } else{
                System.out.println("PUSH");
                        }
            }
           
            
            
            
                    
            
           
        
        public static int RandomCard(){
            Random r = new Random();
            int selector = 1+r.nextInt(11);
            return selector;
                    
        }
}
