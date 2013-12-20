/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package luckysevens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class LuckySevens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int initial;

        
       
        initial=getInput("How much money shall we start with?");
        dicegame(initial);
        
//        while(initial>0){
//            roll++;
//            dice1=RandomDice();
//            dice2=RandomDice();
//            if((dice1+dice2)==7){
//             initial+=4;
//                if(initial>maxvalue){
//                    maxvalue=initial;
//                    maxcount=roll;
//                }
//            }else{
//                initial--;
//            }
//        }
//        System.out.println("You are broke after "+roll);
//        System.out.println("You should have quit at "+maxcount+" rolls when you had $"+maxvalue);
//
    }
   public static int RandomDice() {
            Random r = new Random();
            int dice = 1 + r.nextInt(6);
            return dice;
            
    }
      public static int getInput(String message) {
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        input = sc.nextInt();
        return input;


    }
      public static void dicegame(int initial){
          int roll=0;
          int dice1;
          int dice2;
          int maxvalue=initial;
          int maxcount=0;
          
          while(initial>0){
            roll++;
            dice1=RandomDice();
            dice2=RandomDice();
            if((dice1+dice2)==7){
             initial+=4;
                if(initial>maxvalue){
                    maxvalue=initial;
                    maxcount=roll;
                }
            }else{
                initial--;
            }
        }
        System.out.println("You are broke after "+roll);
        System.out.println("You should have quit at "+maxcount+" rolls when you had $"+maxvalue);

      
      }
} 