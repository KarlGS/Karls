/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recordfiles;

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
public class RecordFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String,Breeds> breeds = new HashMap<String, Breeds>();
        Breeds breed1 = new Breeds();
        breed1.setName("Yorkie");
        breed1.setAge(4);
        breed1.setWeight(32);
        
        Breeds breed2 = new Breeds();
        breed2.setName("Great_Dane");
        breed2.setAge(3);
        breed2.setWeight(330);
        
        breeds.put(breed1.getName(),breed1);
        breeds.put(breed2.getName(),breed2);
        
        Set<String> keySet = breeds.keySet();
        Iterator<String> iter = keySet.iterator();
        System.out.println("Listing dogs");
        while(iter.hasNext()){
            String currentDog=iter.next();
            Breeds breed = breeds.get(currentDog);
            System.out.println("++++++++++++++++++++++++++++++++++++");
            System.out.println("Dog: "+ currentDog );
            System.out.println("Age: "+ breed.getAge());
            System.out.println("Weight: "+breed.getWeight());
            
        }
        
        PrintWriter out = null;
        try{
            out = new PrintWriter(new FileWriter("dogs.txt"));
            keySet=breeds.keySet();
            iter = keySet.iterator();
            while(iter.hasNext()){
                String currentKey= iter.next();
                Breeds currentBreed= breeds.get(currentKey);
                out.println(currentKey+"::"+currentBreed.getAge()+"::"+currentBreed.getWeight());
            }
            
        }catch(IOException io){
            System.out.println("ERROR IOException: "+io.getLocalizedMessage());
        }finally{
            if(out!=null){
                out.close();
            }
        }
        HashMap<String,Breeds> newMap = new HashMap<String,Breeds>();
        Scanner sc = null;
        try{
            sc = new Scanner(new BufferedReader(new FileReader("dogs.txt")));
            while(sc.hasNext()){
                String currentLine = sc.nextLine();
                String[] currentTokens = currentLine.split("::");
                Breeds currentBreed = new Breeds();
                currentBreed.setName(currentTokens[0]);
                currentBreed.setAge(Integer.parseInt(currentTokens[1]));
                currentBreed.setWeight(Integer.parseInt(currentTokens[2]));
                newMap.put(currentTokens[0],currentBreed);
                
            }
        }catch(FileNotFoundException ex){
            System.out.println("ERROR: "+ex.getMessage());
        }finally{
            if(sc!=null){
                sc.close();
            }
        }
            
            
            }
            
        }
        
        
    
        
    

    
