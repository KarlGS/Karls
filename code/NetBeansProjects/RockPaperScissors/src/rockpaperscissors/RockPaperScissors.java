/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int user;
        int cpupick;
        
        System.out.println(" Please choose:\n1)Rock\n2)Paper\n3)Scissors");
        user=sc.nextInt();
        cpupick=RandomDice();
     
        if(user==1&&cpupick==3){
            System.out.println("You chose rock. Computer chose scissors");
            System.out.println("You win.");
        } else if(user ==2&&cpupick==1){
            System.out.println("You chose paper. Computer chose rock.");
            System.out.println("You win.");
        } else if(user ==3&& cpupick==2){
            System.out.println("You chose scissors. Computer chose paper.");
            System.out.println("You win.");
                    
                   
        } else if(user==1&&cpupick==2){
            System.out.println("Computer chose Paper");
            System.out.println("You lose.");

        }else if(user==2&&cpupick==3){
            System.out.println("Computer chose Scissors");
            System.out.println("You lose.");

        }else if(user==3&&cpupick==1){
            System.out.println("Computer chose Rock");
            System.out.println("You lose.");
        
        } else {
            System.out.println("Its a tie");
        }
        
        
          
    }
        public static int RandomDice() {
            Random r = new Random();
            int selector = 1 + r.nextInt(3);
            return selector;


          
    }
}
  
