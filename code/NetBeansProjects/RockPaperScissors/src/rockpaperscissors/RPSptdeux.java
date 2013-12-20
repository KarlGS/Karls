/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;
import static rockpaperscissors.RockPaperScissors.RandomDice;

/**
 *
 * @author apprentice
 */
public class RPSptdeux {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int user;
        int cpupick;
        int rounds;
        final int MIN = 1;
        final int MAX = 10;
        int wins=0;
        int losses=0;
        int ties=0;
        System.out.println("How many rounds shall we play?"); 
        rounds=sc.nextInt();
        while(rounds>MAX||rounds<MIN){
            System.out.println("I'm sorry. Please input an acceptable amount of rounds.");
            rounds=sc.nextInt();
        }
        while(rounds>0){
         rounds--;
        
        System.out.println(" Please choose:\n1)Rock\n2)Paper\n3)Scissors");
        user=sc.nextInt();
        cpupick=RandomDice();
     
        if(user==1&&cpupick==3){
            System.out.println("You chose rock. Computer chose scissors");
            System.out.println("You win.");
            wins++;
        } else if(user ==2&&cpupick==1){
            System.out.println("You chose paper. Computer chose rock.");
            System.out.println("You win.");
            wins++;
        } else if(user ==3&& cpupick==2){
            System.out.println("You chose scissors. Computer chose paper.");
            System.out.println("You win.");
            wins++;
                    
                   
        } else if(user==1&&cpupick==2){
            System.out.println("Computer chose Paper");
            System.out.println("You lose.");
            losses++;
        }else if(user==2&&cpupick==3){
            System.out.println("Computer chose Scissors");
            System.out.println("You lose.");
            losses++;
        }else if(user==3&&cpupick==1){
            System.out.println("Computer chose Rock");
            System.out.println("You lose.");
            losses++;
        } else {
            System.out.println("Its a tie");
            ties++;
        }
        }
        System.out.println("You won " +wins+" times.");
        System.out.println("You lost " + losses+" times.");
        System.out.println("You tied " + ties + " times.");
          
    }
        public static int RandomDice() {
            Random r = new Random();
            int selector = 1 + r.nextInt(3);
            return selector;


          
    }
}
  


