/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package methoddemo;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class MethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        doIt();
//        doIt();
//        silly(5);
  // int result=sillyReturnPlus(5);
   //System.out.println(result);
        String widthMessage= "Please enter window width";
        String heightMessage="Please enter window height";
        double width;
        double height;
        final double MIN_WIDTH=1;
        final double MAX_WIDTH=20;
        final double MIN_HEIGHT=4;
        final double MAX_HEIGHT=50;
        
        width = readDouble(widthMessage,MIN_WIDTH,MAX_WIDTH);
        height=readDouble(heightMessage,MIN_HEIGHT,MAX_HEIGHT);
        
        System.out.println("Width = " + width +" Height = " +height);
    }
    
    public static double readDouble(String prompt, double low, double high){
        double result=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println(prompt +" between " +low+ " and "+ high);
            result =sc.nextDouble();
            
        }while(result<low||result>high);
        return result;
    }
    
    public static void doIt(){
        System.out.println("Hello");
    }
    public static void silly(int i){
        System.out.println("i is: "+ i);
    }
    
    public static int sillyReturnPlus(int i){
        i++;
        System.out.println("i is: " + i);
        return i;
    }
}
