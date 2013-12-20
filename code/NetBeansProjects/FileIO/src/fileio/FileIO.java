/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class FileIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(new BufferedReader(new FileReader("foo.txt")));
        
            while(sc.hasNextLine()){
                String currentLine = sc.nextLine();
                System.out.println(currentLine);
                String[] addressArray= currentLine.split("\\|");
                for(int i =0; i <addressArray.length;i++){
                    System.out.println(addressArray[i]);
                }
                System.out.println();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Could not find file.");
        }finally{
            if(sc!=null){
            sc.close();
        }
      }
    }
}
