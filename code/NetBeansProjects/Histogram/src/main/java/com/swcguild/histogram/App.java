package com.swcguild.histogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/**
 * Hello world!
 *
 */
public class App {
    
    
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(23);
        numbers.add(23);
        numbers.add(22);
        numbers.add(22);
        App myApp = new App();
        HashMap<Integer,Integer> hm = myApp.mapIt(numbers);
        myApp.printHistogram(hm);
    }
    public HashMap mapIt(ArrayList<Integer> numbers) {

        HashMap<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        int count = 1;
        for (int i = 0; i < numbers.size(); i++) {

            if (!histogram.containsKey(numbers.get(i))) {

                histogram.put(numbers.get(i), 1);
            } else {
              Integer foo =  histogram.get(numbers.get(i));
              foo++;
              histogram.put(numbers.get(i), foo);
                
            }

        }
        return histogram;
    }
    public void printHistogram(HashMap<Integer,Integer> h){
        
        h.keySet().toArray();
        
        Set<Integer> keySet = h.keySet();
        Integer[] keyArray = new Integer[keySet.size()];
        keyArray = keySet.toArray(keyArray);
        Arrays.sort(keyArray);
        Iterator<Integer> vistNext = keySet.iterator();
        while(vistNext.hasNext()){
            Integer currentKey = vistNext.next();
            Integer numberOfAsteriks = h.get(currentKey);
            System.out.print(currentKey+":: ");
            for(int i = 0;i<numberOfAsteriks;i++){
                System.out.print("*");                
            }
            System.out.println();
        }
        
    }
}
