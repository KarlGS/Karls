/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MMMDAO;

import Numbers.Numbers;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class MMMDAO {

    private ArrayList<Numbers> numberArray = new ArrayList<Numbers>();
    Numbers newNumbers = new Numbers();

       public ArrayList<Numbers> readWord(String file) {
           ArrayList<Numbers> numbers = new ArrayList();
           try {
            Scanner sc = null;
                sc = new Scanner(new BufferedReader(new FileReader(file)));
                
                
                
                while(sc.hasNextLine()){
                    numbers = new ArrayList();
                    while(sc.hasNext()){
                 
                    String line = sc.next();
                    String[] number = line.split("::");
                    for(int i = 0;i<number.length;i++){
                    newNumbers= new Numbers();
                    newNumbers.setNumber(Integer.parseInt(number[i]));
                    numbers.add(newNumbers);
                    
                        

                    }
                     return numbers;
                    }
                    return numbers;
                }
               
                 
                 
                sc.close();
                
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MMMDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
     return numbers;
    }
    
    
    
       
    
    public void addWord(Numbers newNumber) {
        numberArray.add(newNumber);

    }

    public double getMean(ArrayList<Numbers> array) {
        int total = 0;
        for (int i = 0; i < array.size(); i++) {
            total += array.get(i).getNumber();

        }
        return (total / array.size());

    }

    public double getMode(int[] a) {
        int maxValue=0;
        int maxCount=0;

        for (int i = 0; i < a.length; ++i) {
            int count = 0;
            for (int j = 0; j < a.length; ++j) {
                if (a[j] == a[i]) {
                    ++count;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = a[i];
            }
        }

        return maxValue;
    }
    
    public  int getMedian(int[] m) {
    int middle = m.length/2;
    if (m.length%2 == 1) {
        return m[middle];
    } else {
        return (m[middle+1] + m[middle]) / 2;
    }
}
    public  int[] convertIntegers(ArrayList<Numbers> integers)
{
    int[] ret = new int[integers.size()];
    for (int i=0; i < ret.length; i++)
    {
        ret[i] = integers.get(i).getNumber();
    }
    return ret;
}
}
