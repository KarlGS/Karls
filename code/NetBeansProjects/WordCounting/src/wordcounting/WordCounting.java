/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcounting;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class WordCounting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;
        int a;
      
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
   
        
        int spaces = s.length() - s.replace(" ", "").length()+1;
        System.out.println(spaces);
        
// TODO code application logic here
    // String[] words;
    // words=input.split(" ");
     System.out.println(words);
    
    
    
    }
}
