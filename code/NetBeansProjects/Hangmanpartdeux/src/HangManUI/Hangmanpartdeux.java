/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HangManUI;

import WordFactorydao.WordFactory;
import Words.Words;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Hangmanpartdeux {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordFactory myWords = new WordFactory();
        int choice = 0;
        String addWord="";
        myWords.readWord();
        Words newEntry = new Words();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("\nWelcome to Hangmen");
        System.out.println("\n 1.Add word(s) to game library");
        System.out.println("\n 2.Play Game");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        choice=sc.nextInt();
        
        
        if(choice==1){
            System.out.println("Please type the word you'd like to add");
            addWord=sc.next();
            newEntry.setWord(addWord.toLowerCase());
            myWords.addWord(newEntry);
            myWords.writeWords();
            
        }else if(choice==2){
        }
        
        
    }
}
