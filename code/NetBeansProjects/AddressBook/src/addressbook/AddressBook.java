/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class AddressBook {
        private static final String ADDYBOOK = "addybook.txt";
        Address addyBook = new Address();
        private HashMap<String, Address> addy = new HashMap<String, Address>();
        
       public void loadAddy()throws FileNotFoundException { 
       Scanner sc = new Scanner(new BufferedReader(new FileReader(ADDYBOOK)));
        String currentLine;
        String[] currentTokens;
        
        while(sc.hasNextLine()){
            currentLine=sc.nextLine();
            currentTokens = currentLine.split("::");
            Address currentAddy = new Address();
            currentAddy.setFirstName(currentTokens[0]);
            currentAddy.setLastName(currentTokens[1]);
            currentAddy.setStreet(currentTokens[2]);
            currentAddy.setCity(currentTokens[3]);
            currentAddy.setState(currentTokens[4]);
            currentAddy.setZip(currentTokens[5]);
            addy.put(currentAddy.getLastName(),currentAddy);
        }
            sc.close();
        }
       
       public void addAddy(Address addAddress ){

           addy.put(addAddress.getLastName(),addAddress);
           Set<String>keySet = addy.keySet();
        
           Iterator<String> iter = keySet.iterator();
           PrintWriter out = null;
           try {
            //Write our items out to a file.
            //Create a PrintWriter to handle out output
                out = new PrintWriter(new FileWriter("addybook.txt"));
            // Get the set of keys from the map
                keySet=addy.keySet();
                iter = keySet.iterator();
            while(iter.hasNext()){
                String currentKey = iter.next();
                Address currentAddy = addy.get(currentKey);
                //write out this item's information to the file
                out.println(currentAddy.firstName+"::"+currentAddy.lastName+"::"+currentAddy.street+"::"+currentAddy.city+"::"+currentAddy.state +"::"+currentAddy.zip);
            }
            
        } catch (IOException ex) {
            System.out.println("ERROR - IOException:"+ex.getMessage());
        } finally{
            if(out!= null){
                out.close();
            }
        }
       }
        
       public void removeAddy(String addyKey){
           addy.remove(addyKey);
                 addy.remove(addyKey);
                Set<String> keySet = addy.keySet();
        Iterator<String> iter = keySet.iterator();
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter("addybook.txt"));
            keySet = addy.keySet();
            iter = keySet.iterator();
            while (iter.hasNext()) {
                String currentKey = iter.next();
                Address currentAddy = addy.get(currentKey);
                out.println(currentAddy.firstName + "::" + currentAddy.lastName + "::" + currentAddy.street + "::" + currentAddy.city + "::" + currentAddy.state + "::" + currentAddy.zip);
            }
        } catch (IOException ex) {
            System.out.println("Error - IOException: " + ex.getMessage());
        } finally {
            //close up resources
            if (out != null) {
                out.close();
            }
        }
    }
       
       
       public HashMap listAddy(){
           return addy;
       }
       public void displayNumAddy(){
           System.out.println(addy.size());
       }
       
       public Address searchAddy(String addyKey){
          Address currentAddy= addy.get(addyKey);
          return currentAddy;
       }
}
 
                
