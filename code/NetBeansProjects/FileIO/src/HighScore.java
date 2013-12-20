
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apprentice
 */
public class HighScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      PrintWriter out = null;
      String highscore;
      String name;
      
      System.out.println("Give me a high score");
      highscore=sc.next();
      
      System.out.println("Please give me your name");
      name = sc.next();
        try {
            //Write our items out to a file.
            //Create a PrintWriter to handle out output
            out = new PrintWriter(new FileWriter("output.txt"));
            out.println(name+" high score is "+highscore);
            
        } catch (IOException ex) {
            System.out.println("ERROR - IOException:"+ex.getMessage());
        } finally{
            if(out!= null){
                out.close();
            }
        
    
    
    
    
         sc = null;
        try{
        BufferedReader br=null;
        String currentLine="";
         br = new BufferedReader(new FileReader("output.txt"));
        while((currentLine= br.readLine()) !=null){
         System.out.println(currentLine);
            
        }
        } catch (FileNotFoundException ex){
            System.out.println("ERROR - "+ ex.getMessage());
        }   catch (IOException ex) {
                Logger.getLogger(HighScore.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
            if(sc !=null){
                sc.close();
            }
        }
        }
    }
}
    
    


    

    
        


     



        
        
        
        
        
        
        
//        
//        
//         sc = null;
//        try {
//            sc = new Scanner(new BufferedReader(new FileReader("highscore.txt")));
//        
//            while(sc.hasNextLine()){
//                String currentLine = sc.nextLine();
//                System.out.println(currentLine);
//                String[] addressArray= currentLine.split("\\|");
//                for(int i =0; i <addressArray.length;i++){
//                    System.out.println(addressArray[i]);
//                }
//                System.out.println();
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println("Could not find file.");
//        }finally{
//            if(sc!=null){
//            sc.close();
//        }
//      }
//    }
//}


