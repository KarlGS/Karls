/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package triangleidentifier;
 import TriangleConsoleIO.TriangleConsoleIO;

/**
 *
 * @author apprentice
 */
public class TriangleIdentifierUI {

    /**
     * @param args the command line arguments
     */
    
    private TriangleConsoleIO con = new TriangleConsoleIO();
    private TriangleTypeDecider decider = new TriangleTypeDecider();
    public static void main(String[] args) {

    }

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        
        while(keepGoing){
            menuSelection=con.readInt("Please select from the options above");
                switch (menuSelection) {
                    case 1:
                        con.print("Gathering values from file..");
                        break;
                    case 2:
                        con.print("Gathering values from console...");
                        break;
                    case 3:
                        con.print("Exiting...");
                        keepGoing = false;
                        break;
                    default:
                        con.print("Unknown Command...");
                }

            }
            con.print("I hope you enjoyed identifying your Triangle, Thanks!");      
            
        }
    
    private void idTriangleByFile(){
        String filename =con.readString("Please enter the exact file name");
        
    }
            
    

    private void printMenu() {
        con.print("Triangle Identifier Main Menu");
        con.print("1. Use a file to input values");
        con.print("2. Give Values Through Console");
        con.print("3. Quit Program");
       
    }
}
