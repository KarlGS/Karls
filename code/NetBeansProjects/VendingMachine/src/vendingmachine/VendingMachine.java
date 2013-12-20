/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class VendingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int selection;
        int change;
        VMConsole first = new VMConsole();
        selection=first.selector();
        change=first.changeBack(selection);
        first.breakDown(change);
        
              
              
}
        
        
        
                
    
    
}
