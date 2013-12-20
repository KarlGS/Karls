/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvd;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class DVDLibrary {
    public static final String DVD_FILE ="dvd.txt";
    private File dvdFile = new File(DVD_FILE);
    public static final String DELIMITER ="::";
    private HashMap<String, DVD> collection = new HashMap<String,DVD>();
    
    public void loadDVD(){
        Scanner sc = null;
        try{
                    
             sc = new Scanner(new BufferedReader(new FileReader(DVD_FILE)));

        
        String currentLine;
        String[] currentTokens;
        String[] noteTokens;
        while (sc.hasNextLine()){
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            int currentTokensLength = currentTokens.length - 1;
            String notes = currentTokens[5];//Returned Notes Array
            DVD currentDVD = new DVD();
            currentDVD.setTitle(currentTokens[0]);
            currentDVD.setReleaseDate(currentTokens[1]);
            currentDVD.setRating(currentTokens[2]);
            currentDVD.setDirector(currentTokens[3]);
            currentDVD.setStudio(currentTokens[4]);
            currentDVD.setNote(notes);
//            for(int i =0; i< notesArray.length; i++){
//                currentDVD.addNote(notesArray[i]);
//            }
            
            collection.put(currentDVD.getTitle(), currentDVD);
        }          
          }catch (FileNotFoundException ex){
               System.out.println("Caught FileNotFoundExceptoin: "+ex.getMessage());
        }finally{
            if(sc!=null){
                 sc.close();
    }
}
    }
    public DVD addDVD(DVD addDVD){
        return collection.put(addDVD.getTitle(), addDVD);
        
    }
    
    public DVD getDVD(String title){
        return collection.get(title);
    }
    
    public void writeLibrary()  {
        PrintWriter out = null;
        try{
        out = new PrintWriter(new FileWriter(DVD_FILE));
        PrintWriter otherWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(dvdFile)));
        String[] keys = this.getAllTitles();
      
        
        
        
        for (int i = 0; i< keys.length;i++){
            DVD currentDVD = this.getDVD(keys[i]);
            
            out.println(currentDVD.getTitle()+DELIMITER
                    +currentDVD.getReleaseDate()+DELIMITER
                    +currentDVD.getRating()+DELIMITER
                    +currentDVD.getDirector()+DELIMITER
                    +currentDVD.getStudio()+DELIMITER);
       
            
        
        for(int j=0;j<currentDVD.getNote().length;j++){
            String[] localNotesArray = currentDVD.getNote();
            if (j == localNotesArray.length - 1) {
                out.print(localNotesArray[j]);
            } else {
                out.print(localNotesArray[j] + ";;");
            }
             }
        }
        }catch(IOException ex){
            System.out.println("Error IOException"+ex.getMessage());
        }finally{
            if (out!=null){
            out.flush();
            
        }
        out.close();
    }
    }  
    
//    public void getNotes(String title){
//        String[] notesArray;
//        if (collection.containsKey(title)) {
//            notesArray = collection.get(title).getNote().splits(";;");
//        }
//    }
    public String[] getAllTitles() {
        Set<String> keySet= collection.keySet();
        String[] keyArray = new String[keySet.size()];
        keyArray = keySet.toArray(keyArray);
        return keyArray;
    }
    public void removeDVD(String title){
        collection.remove(title);
    }
    
    public int displayDVDS(){
        return collection.size();
    }
    
}
