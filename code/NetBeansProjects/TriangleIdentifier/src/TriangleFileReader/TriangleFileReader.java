/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TriangleFileReader;

import TriangleModel.Triangle;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class TriangleFileReader {
    public static final String DELIMITER="::";
//    private int[] triangleSides = new int[3];
    
    public void loadTriangleSides(String fileName){
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(fileName)));
            while(sc.hasNext()){
                String triangleSides = sc.nextLine();
                String[] currentSide = triangleSides.split(DELIMITER);
                Triangle newTriangle = new Triangle();
                newTriangle.setSide1(Integer.parseInt(currentSide[0]));
                newTriangle.setSide1(Integer.parseInt(currentSide[1]));
                newTriangle.setSide3(Integer.parseInt(currentSide[2]));
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TriangleFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
