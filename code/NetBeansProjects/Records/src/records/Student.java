/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package records;

/**
 *
 * @author apprentice
 */
public class Student{
    String firstName;
    int grade;
    double gpa;
    String name;
    public  double total=0;

    public Student(String who,int whatGrade,double whatGpa){
        grade=whatGrade;
        gpa=whatGpa;
        name=who;
        total++;
    }
         public String getValues(){
             
             return "The name is "+ name+"\nThe grade is: "+grade+"\nThe averages is: "+gpa; 
         }
         public String toString(){
             return name+" "+grade+" "+gpa;
         }
}