/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachineconsole;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

/**
 * A Vending Machine Program
 * @author apprentice
 */
public class VendingMachine {
    private static final String INVENTORY_FILE ="inventory.txt";
    private HashMap<String, Item> items = new HashMap<String, Item>();
    
    public void loadInventory() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(INVENTORY_FILE)));
        // load inventory items - one per line in file
        // Expected file format:
        // item name::item price
        String currentLine;
        String[] currentTokens;
        
        while(sc.hasNextLine()){
            // read in an item
            currentLine=sc.nextLine();
            // split item into name and price
            currentTokens = currentLine.split("::");
            // creat item and add it to tiems map
            Item currentItem = new Item(currentTokens[0], Float.parseFloat(currentTokens[1]),Integer.parseInt(currentTokens[2]));
            items.put(currentItem.getName(), currentItem);
            
            
        }
    }
    
    public HashMap getInventory(){
        return items;
    }
    
    public Change vend(String itemKey, float moneyIn) throws Exception {
        Item currentItem = items.get(itemKey);
        if(moneyIn < currentItem.getPrice()){
            throw new Exception("Please insert more money.");
        }
        return new Change(moneyIn - currentItem.getPrice());
    }
    
    public int stock(String itemKey){
        int vendedItem;
        Item currentItem=items.get(itemKey);
        vendedItem =(currentItem.getInventory()-1);
        return vendedItem;
    }
}
