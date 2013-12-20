/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mapexample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class MapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a HashMap that requires the keys to be Strings
        // and the values to be Item objects
        HashMap<String, Item> myMap = new HashMap<String, Item>();

        // Create some Items to play with
        Item item1 = new Item();
        item1.setName("Snickers");
        item1.setPrice(1.50f);

        Item item2 = new Item();
        item2.setName("Chips");
        item2.setPrice(1.75f);

        Item item3 = new Item();
        item3.setName("Dr. Pepper");     
        item3.setPrice(2.00f);
        // put item3 (which is Dr.Pepper) into the map and         // associate with the key A1
        myMap.put("A1", item3);
        // put item1 (which is Snickers) into the map and
        //associate with the key B1
        myMap.put("B1", item1);
        //put item 2(which is Chips) into the map and 
        //associate with the key C1
        myMap.put("C1", item2);



       
        //Read some items in from a file
        //Process:
        //1.Open file - process line by line
        //2.For each line in file:
        
        
        
        
        //list everything in a map - assuming we don't know the keys 
        //ahead of time. 
        //ask for a Set (blob) of keys(inherently unordered)
        Set<String> keySet = myMap.keySet();
        //get an iterator - we can ask it to visit each key in the set
        //one by one
        Iterator<String> iter = keySet.iterator();
        //visit each key and ask for associated item
        System.out.println("Listing items from HashMap in memory.");
        while (iter.hasNext()) {
            //get the next key
            String currentKey = iter.next();
            //get item out of the map associated with that key
            Item item = myMap.get(currentKey);
            //Print everything to 
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("Item key = " + currentKey);
            System.out.println("Item name = " + item.getName());
            System.out.println("Item Price = "+ item.getPrice());
           

        }
        PrintWriter out = null;
        try {
            //Write our items out to a file.
            //Create a PrintWriter to handle out output
            out = new PrintWriter(new FileWriter("output.txt"));
            // Get the set of keys from the map
            keySet=myMap.keySet();
            iter = keySet.iterator();
            while(iter.hasNext()){
                String currentKey = iter.next();
                Item currentItem = myMap.get(currentKey);
                //write out this item's information to the file
                out.println(currentKey+ "::"+currentItem.getName()+"::"+ currentItem.getPrice());
            }
            
        } catch (IOException ex) {
            System.out.println("ERROR - IOException:"+ex.getMessage());
        } finally{
            if(out!= null){
                out.close();
            }
        }
        HashMap<String, Item> newMap = new HashMap<String, Item>();
        ArrayList<Item>newList = new ArrayList<Item>();
        
        //Read some items in  from a file and put them in another map and put them
        // int an ArrayList
        // Process:
        // 1. Open file - process line by line
        // 2. For each line in file:
        //      a. split on the delimiter(::)
        //      b. Put the result into Key and our Item (name, price)
        //      c. Put each item in a map and into an ArrayList
        Scanner sc = null;
        try{
        
        sc = new Scanner(new BufferedReader(new FileReader("output.txt")));
        while(sc.hasNextLine()){
            // read next line into memory
            String currentLine = sc.nextLine();
            //break up line (:: is our delimiter)
            String[] currentTokens = currentLine.split("::");
            //createour new item (based on info from file that's in currentTokens)
            Item currentItem = new Item();
            currentItem.setName(currentTokens[1]);
            currentItem.setPrice(Float.parseFloat(currentTokens[2]));
            // store item in map - with the proper key value
            newMap.put(currentTokens[0], currentItem);
            newList.add(currentItem);
            
        }
        } catch (FileNotFoundException ex){
            System.out.println("ERROR - "+ ex.getMessage());
        } finally{
            if(sc !=null){
                sc.close();
            }
            
        }
        //Iterate through newList and display Items read from file
        for(int i = 0; i<newList.size();i++){
            // we're treating an ArrayList like an array
            // instead of newList[i] we have to use newList.get(i)
            Item currentItem = newList.get(i);
            System.out.println("===========================================");
            System.out.println(currentItem.getName());
            System.out.println(currentItem.getPrice());
        }
    }
}
