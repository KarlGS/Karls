/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachineconsole;


import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class VendingMachineConsole {

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String choice;
        float moneyIn;
        int remaining;
        int answer=0;
        do{
        System.out.println("Welcome to the VendMaster6000");
        System.out.println("Here's our menu: ");
        
        
        
        VendingMachine vm = new VendingMachine();
        try{
            // load inventory from file
            vm.loadInventory();
            // get the map containing all the items in inventory
            HashMap<String, Item> stuff = vm.getInventory();
            // print out how many things are in the map
            //System.out.println("We currently have "+ stuff.size()+" great products to choose from.");
            // get all the keys for the map

            Set<String> keys = stuff.keySet();
            Iterator<String> iter = keys.iterator();
            while(iter.hasNext()){
                String currentKey = iter.next();
                
                // get current key
                
                // print out value of current key
                System.out.println("Current Key = " + currentKey);
                // get the value associated with current key(this will be an Item object)
                Item currentItem = stuff.get(currentKey);
                // print out current item object and price
                System.out.println("Current Item: " + currentItem.getName()+currentItem.getPrice());
            
            }
            System.out.println("What would you like to order?");
            choice=sc.next();
            remaining = vm.stock(choice);
            System.out.println("How much money will you be entering.");
            moneyIn = sc.nextFloat();
            Change myChange = vm.vend(choice, moneyIn);
            System.out.println("There is only "+ remaining+ " "+ " left.");
            System.out.println("Quarters: "+ myChange.getQuarters());
            System.out.println("Dimes: "+ myChange.getDimes());
            System.out.println("Nickels: "+myChange.getNickels());
            System.out.println("Pennies: "+myChange.getPennies());
        } catch (FileNotFoundException ex){
            System.out.println("Error loading inventory. Please make sure inventory file is correct.");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Do you want to continue 1-no 2 - yes");
        answer=sc.nextInt();
    }while(answer!=1);
    
        
    }
}