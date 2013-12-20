/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringexamples;

/**
 *
 * @author apprentice
 */
public class StringExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String browns = "Pittsburgh Steelers";
       
       int length = browns.length();
       char first = browns.charAt(0);
       System.out.println(first);
       char last = browns.charAt(length-1);
       System.out.println(last);
       
       for(int i =0; i < browns.length(); i++){
           char current = browns.charAt(i);
           System.out.println(current);
       }
       String sub = browns.substring(2,4);
       System.out.println(sub);
       
       String[] splits =browns.split(" ");
       int splitslength=splits.length;
       for(int i =0; i<splitslength;i++){
           String currentString = splits[i];
           System.out.println(currentString);
       }
       System.out.println(splits[0]);
    }
}
