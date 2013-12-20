/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recordfiles;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class HighScore {
    public void loadHighScore(int score, String name){
        PrintWriter out= null;
        try {
            out = new PrintWriter(new FileWriter("highscore.txt"));
        } catch (IOException ex) {
            System.out.println("System ERROR: "+ex.getMessage());
            out.println(score);
            out.println("");
        }
        
        
    }
}
