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
public class TwentyQuestions {
         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             String animal;
             String vegetable;
             String mineral;
             String firstAnswer;
             String secondAnswer;
             String guess = null;
             
             System.out.println("TWO QUESTIONS!");
             System.out.println("Think of an object, and I'll try to guess it.");
             
             System.out.println("Question 1) Is it animal, vegetable, or mineral?");
             firstAnswer=sc.next().toLowerCase();
             
             System.out.println("Question 2) Is it bigger than a bread box?");
             secondAnswer=sc.next().toLowerCase();
             
             if (firstAnswer.equals("animal")){
                 if (secondAnswer.equals("yes")) {
                     guess = "moose";
                 } else {
                     guess = "mouse";
                 }
             }
             if (firstAnswer.equals("vegetable")) {
                 if (secondAnswer.equals("yes")){
                     guess = "watermelon";
                 }else{
                     guess ="corn";
                 }
             }
             
             if(firstAnswer.equals("mineral")){
                 if (secondAnswer.equals("yes")){
                     guess="diamond";
                 } else{
                     guess = "truck";
                 }
             }
                 
            System.out.println("My guess is that you are thinking of a "+ guess +".");
            System.out.println("I would ask you if I'm right, but I don't actually care.");
                 
                 
         }
}
