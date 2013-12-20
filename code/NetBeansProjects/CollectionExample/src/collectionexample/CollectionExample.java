/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author apprentice
 */
public class CollectionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        HashMap<String, Student> studentMap = new HashMap<String, Student>();
        System.out.println(students.size());
                
        Student student1= new Student();
        student1.setFirstName("John");
        student1.setLastName("Doe");
        student1.setGradYear(2020);
        student1.setGpa(3.45);
        
        students.add(student1);
        studentMap.put(student1.getFirstName(), student1);
        
        Student tempStudent = studentMap.get(student1.getFirstName());
        student1= new Student();
        student1.setFirstName("Jane");
        student1.setLastName("Doe");
        student1.setGradYear(2021);
        student1.setGpa(3.555);
        
        students.add(student1);
        
        student1= new Student();
        student1.setFirstName("Sally");
        student1.setLastName("Doe");
        student1.setGradYear(2025);
        student1.setGpa(3.99);
        
        students.add(student1);
        
        student1.setGradYear(2000);
        
        student1 = students.get(1);
        student1.setLastName("Smith");
        
        System.out.println(students.size());
        
        Iterator<Student> iter = students.iterator();
        
        while(iter.hasNext()){
            Student current = iter.next();
            System.out.println(current.getFirstName());
            System.out.println(current.getLastName());
            System.out.println(current.getGradYear());
            
            
        }
        
        
        
    }
}
