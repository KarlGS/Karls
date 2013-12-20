/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Words;

import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public class Words {
    private ArrayList<String>words= new ArrayList();
    private String word;
 
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
     public String[] getIndividualWord() {
        return word.split(";;");
     }
   

    
    

    
}
