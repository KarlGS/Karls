/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalcreloaded;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ConsoleIO {

    private Scanner sc = new Scanner(System.in);

    public void print(String msg){
        System.out.println(msg);
    }
    
    
    
    public String readString(String prompt){
        sc.nextLine();
        System.out.println(prompt);
        return sc.nextLine();
    }
    
    public int readInt(String prompt) {
        boolean badInput = false;
        int result =0;
        do {
            try {

                System.out.println(prompt);
                result = sc.nextInt();
                badInput=false;
            } catch (InputMismatchException ime) {
                badInput = true;
                sc.nextLine();
            }
        } while (badInput);

        return result;
    }
    
    public int readInt(String prompt, int min, int max){
        
        int result;
        do{
            result = readInt(prompt);
        } while(result<min ||result>max);
        
        return result;
    }
    
        public long readLong(String prompt) {
        boolean badInput = false;
        long result =0;
        do {
            try {

                System.out.println(prompt);
                result = sc.nextLong();
                badInput=false;
            } catch (InputMismatchException ime) {
                badInput = true;
                sc.nextLine();
            }
        } while (badInput);

        return result;
    }
    
    public long readLong(String prompt, long min, long max){
        
        long result;
        do{
            result = readLong(prompt);
        } while(result<min ||result>max);
        
        return result;
    }
    
        public float readFloat(String prompt) {
        boolean badInput = false;
        float result =0;
        do {
            try {

                System.out.println(prompt);
                result = sc.nextFloat();
                badInput=false;
            } catch (InputMismatchException ime) {
                badInput = true;
                sc.nextLine();
            }
        } while (badInput);

        return result;
    }
    
    public float readFloat(String prompt, float min, float max){
        
        float result;
        do{
            result = readFloat(prompt);
        } while(result<min ||result>max);
        
        return result;
    }

    public double readDouble(String prompt) {
        boolean badInput = false;
        double result =0;
        do {
            try {

                System.out.println(prompt);
                result = sc.nextDouble();
                badInput=false;
            } catch (InputMismatchException ime) {
                badInput = true;
                sc.nextLine();
            }
        } while (badInput);

        return result;
    }
    
    public double readDouble(String prompt, double min, double max){
        
        double result;
        do{
            result = readInt(prompt);
        } while(result<min ||result>max);
        
        return result;
    }

}

    