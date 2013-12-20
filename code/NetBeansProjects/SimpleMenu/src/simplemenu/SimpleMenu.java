/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simplemenu;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SimpleMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userCommand;


        System.out.println("Type 1 to Open a File");
        System.out.println("Type 2 to Close the current File");
        System.out.println("Type 3 to Bring up the Help Menu");
        userCommand = sc.nextInt();

//        if (userCommand == 1) {
//            System.out.println("Please type in the name of the type of file you wish to open");
//            // some code read in the user choice
//            // some code to open the file
//        } else if (userCommand == 2) {
//                System.out.println("Closing current file.");
//        } else if (userCommand == 3) {
//                System.out.println("Help Menu");
//        } else {
//            System.out.println("Invalid Command;");
//                  
//                    }
     
        switch(userCommand){
            case 1:
                System.out.println("Please enter the name of the file you wish to open");
                break;
            case 2:
                System.out.println("Close current file");
                break;
            case 3:
                System.out.println("Help Menu");
                break;
            default:
                System.out.println("Invalid Command");
                break;
    }      
    
    }
}

