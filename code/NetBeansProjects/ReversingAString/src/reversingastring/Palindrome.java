/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reversingastring;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String reverse="";
    System.out.println("Give me a word to reverse");
    String input=sc.next();
        for(int j=input.length()-1;j>=0;j--){
            reverse=reverse+input.charAt(j);
        }
    System.out.println("Let me check if its a palindrome");
    input=""+reverse;
    if(input==reverse){
        System.out.println("It is a palindrome");
        
    }else{
        System.out.println("Its not a palindrome");
    }
    System.out.println(reverse);
    System.out.println(input);
    }
}
  

