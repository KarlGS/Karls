/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WordFactorydao;

import Words.Words;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class WordFactory {

    private ArrayList<Words> words = new ArrayList();

    public void readWord() {
        Scanner sc = null;
        try {
            sc = new Scanner(new BufferedReader(new FileReader("words.txt")));
            words = new ArrayList();
            
            
            while(sc.hasNextLine()){
                while(sc.hasNext()){
             
                String line = sc.nextLine();
                String[] word = line.split("::");
                for(int i = 0;i<word.length;i++){
                Words newWord= new Words();
                newWord.setWord(word[i]);
                words.add(newWord);
                    

                }
                }
            }
             
             
            sc.close();
        } catch (IOException ex) {
            Logger.getLogger(WordFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void writeWords() {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter("words.txt"));
                
            
            
            for (int i = 0; i < words.size(); i++) {
                if (i == words.size() - 1) {
                    out.print(words.get(i).getWord());
                } else {
                    out.print(words.get(i).getWord() + "::");
                }
            }
//                  
//        for(int j=0;j<currentDVD.getNote().length;j++){
//            String[] localNotesArray = currentDVD.getNote();
//            if (j == localNotesArray.length - 1) {
//                out.print(localNotesArray[j]);
//            } else {
//                out.print(localNotesArray[j] + ";;");

        } catch (IOException ex) {
            System.out.println("Error IOException" + ex.getMessage());
        } finally {
            if (out != null) {
                out.flush();

            }

        }
 out.close();
    }
    public void addWord(Words newWord){
        words.add(newWord);
        
    }
 
}
