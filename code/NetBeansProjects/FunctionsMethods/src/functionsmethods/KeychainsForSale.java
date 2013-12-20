/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package functionsmethods;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class KeychainsForSale {
    	public static void main( String[] args ){
            Scanner sc = new Scanner(System.in);
            int selection;
            
            
            System.out.println("Ye Ole Keychain Shoppe");
            System.out.println("1. Add Keychains to Order");
            System.out.println("2. Remove Keychains from Order");
            System.out.println("3. View Current Order");
            System.out.println("4. Checkout");
            
            selection=sc.nextInt();
            while(selection!=4){
                if(selection==1){
                    addKeychains();
                    selection=sc.nextInt();
                }else if(selection==2){
                    removeKeychains();
                    selection=sc.nextInt();

                }else if(selection==3){
                    viewOrder();
                    selection=sc.nextInt();

                
            }else if(selection==4){
                   
                }
                
        } checkout();
        }
      public static void addKeychains(){
          Scanner sc = new Scanner(System.in);
          
          int value=0; 
          System.out.println("You have "+value+"keychains. How many to add?");
          value=sc.nextInt();
          System.out.println("You now have "+value+" keychains.");
                  
        }
public static int removeKeychains(){
    int value=0;
    System.out.println("REMOVE KEYCHAINS");
    value=value-1
    }
public static int viewOrder(){
    int value=0;
    System.out.println("VIEW ORDER");
    
}
public static int checkout(){
    System.out.println("CHECKOUT");
}
}

