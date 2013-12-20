/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package writingafile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author apprentice
 */
public class WritingAFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String content = "+-------------------------------------+";
            
            File file = new File("/users/apprentice/Documents/NetBeansProjects/filename.txt");
            
            if(!file.exists()){
                file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            
            System.out.println("Done");
            
        }catch(IOException e){
            e.printStackTrace();
            }
        }
    }

