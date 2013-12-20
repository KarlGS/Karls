
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apprentice
 */
public class Name {
   public static void main(String[] args){ 
        
        try{
        BufferedReader br=null;
        String currentLine="";
         br = new BufferedReader(new FileReader("Name.txt"));
        while((currentLine= br.readLine()) !=null){
         System.out.println(currentLine);
          
        }
        } catch (FileNotFoundException ex){
            System.out.println("ERROR - "+ ex.getMessage());
        }   catch (IOException ex) {
                Logger.getLogger(HighScore.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    }
}
