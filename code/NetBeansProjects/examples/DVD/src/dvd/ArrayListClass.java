/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvd;

import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public class ArrayListClass {

    ArrayList<String> stringList = new ArrayList<>();

    public void run() {
        for (int i = 1; i <= 100; i++) {
            stringList.add(String.valueOf(i));
        }
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }
    
}
