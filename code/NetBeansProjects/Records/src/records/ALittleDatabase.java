/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package records;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ALittleDatabase {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    double gpa;
    
    System.out.println("Student name: ");
    name=sc.next();
    System.out.println("Student grade: ");
    age=sc.nextInt();
    System.out.println("Student sverage: ");
    gpa=sc.nextDouble();
    Student student1 = new Student(name,age,gpa);
    
    System.out.println("Student name: ");
    name=sc.next();
    System.out.println("Student grade: ");
    age=sc.nextInt();
    System.out.println("Student sverage: ");
    gpa=sc.nextDouble();
    Student student2 = new Student(name,age,gpa);
    
    System.out.println("Student name: ");
    name=sc.next();
    System.out.println("Student grade: ");
    age=sc.nextInt();
    System.out.println("Student sverage: ");
    gpa=sc.nextDouble();
    Student student3 = new Student(name,age,gpa);
    
    Student[] children = new Student[3];
    children[0]=student1;
    children[1]=student2;
    children[2]=student3;
    
    System.out.println(children[0].toString());
    System.out.println(children[1].toString());
    System.out.println(children[2].toString());

    
    
}
}