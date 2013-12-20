/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package records;

import java.util.Scanner;



public class BasicRecords {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    double gpa;
    
    
    Student estaban= new Student("Esteban",12,79.3);
    System.out.println(estaban.getValues());
    Student dave = new Student("Dave",10,91);
    System.out.println(dave.getValues());
    Student michelle = new Student("Michelle",11,98.6);
    System.out.println(michelle.getValues());


}
}