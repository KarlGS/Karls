/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karl.trianglefilereader;

import com.karl.trianglemodel.Triangle;
import com.karl.triangleui.TriangleUI;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TriangleFileReader {

    public static final String DELIMITER = "::";
    //loadTriangleSides returns the amount of sides in a file 
    //in case wrong dimensions were found in file   
    public Triangle loadTriangleSides(String fileName) {
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(fileName)));
            String triangleSides;
            String[] currentSide;
            
            if (sc.hasNext()) {
                triangleSides = sc.nextLine();
                currentSide = triangleSides.split(DELIMITER);
                if(currentSide.length==3){
                Triangle newTriangle = new Triangle();
                try {
                newTriangle.setSide1(Integer.valueOf(currentSide[0]));
                newTriangle.setSide2(Integer.valueOf(currentSide[1]));
                newTriangle.setSide3(Integer.valueOf(currentSide[2]));
                } catch (NumberFormatException nfe) {
                    returnToMainMenu();
                }
                sc.close();
                return newTriangle;
                }else{
                    returnToMainMenu();
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File could not be found! " + ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("A triangle with 3 integer length sides was not found.");
        }
        
        return null;
    }
    
    public void returnToMainMenu() {
        TriangleUI newUI= new TriangleUI();
                    System.out.println("\nError parsing file... Please make sure to enter dimensions for a integer sided triangle.\n");
                    newUI.run();
    }
    
}
