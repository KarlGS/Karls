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
public class ReversingAString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input=sc.next();
    String reverse="";
    
        for(int j=input.length()-1;j>=0;j--){
            reverse=reverse+input.charAt(j);
        }
    
    System.out.println(reverse);
    }
}
