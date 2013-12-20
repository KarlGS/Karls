
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apprentice
 */
public class nums {
    public static void main(String[] args) throws IOException{
        
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader("nums")));
            
            BufferedReader br=null;
            int sum=0;
            
            String currentLine;
            while(sc.hasNextInt()){
                sum+=sc.nextInt();
               
            }
             System.out.println(sum);
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR "+ex.getMessage());
        }
        
    }
}
