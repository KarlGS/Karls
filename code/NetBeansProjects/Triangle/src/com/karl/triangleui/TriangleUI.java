/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karl.triangleui;

import com.karl.triangledecider.TypeDecider;
import com.karl.trianglefilereader.TriangleFileReader;
import com.karl.trianglemodel.Triangle;

/**
 *
 * @author apprentice
 */
public class TriangleUI {

    private TriangleConsoleIO con = new TriangleConsoleIO();
    private TypeDecider decider = new TypeDecider();

    public static void main(String[] args) {
        TriangleUI ui = new TriangleUI();
        ui.run();
    }

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;

        while (keepGoing) {
            printMenu();
            menuSelection = con.readOption("Please select from the options above:");
            switch (menuSelection) {
                case 1:
                    con.print("Gathering values from file..");
                    idTriangleByFile();
                    break;
                case 2:
                    con.print("Gathering values from console...");
                    idTriangleByConsole();
                    break;
                case 3:
                    con.print("Exiting...");
                    keepGoing = false;
                    break;
                default:
                    con.print("Unknown Command...");
            }

        }
        con.print("I hope you enjoyed identifying your integer length sided Triangle today, Thanks!");

    }

    private void idTriangleByFile() {
        String filename = con.readString("Please enter the exact file name:");
        TriangleFileReader fr = new TriangleFileReader();
        Triangle newTriangle = new Triangle();
        newTriangle=fr.loadTriangleSides(filename);
        String triType = decider.findTriangleType(newTriangle.getSide1(), newTriangle.getSide2(), newTriangle.getSide3());
        System.out.println("\nYour triangle type is " + triType+"\n");
    }

    private void idTriangleByConsole() {
        
            int side1 = con.readInt("Please enter the length in integers for side #1:");
            int side2 = con.readInt("Please enter the length in integers for side #2:");
            int side3 = con.readInt("Please enter the length in integers for side #3:");
            String triType = decider.findTriangleType(side1, side2, side3);
            System.out.println("\nYour triangle type is " + triType+"\n");
            
        
    }

    private void printMenu() {
        con.print("Triangle Identifier Main Menu");
        con.print("1. Use a file to input values");
        con.print("2. Give values through console");
        con.print("3. Quit program");

    }
}
