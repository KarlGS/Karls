/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalc;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Console {

    Scanner sc = new Scanner(System.in);
    int number;
    String math;
    public final int max = 100;
    float num;
    double num1;

    public int getInt() {
        System.out.println("Give me a number");
        number = sc.nextInt();
        return number;
    }

    public int rightInt() {
        System.out.println("Give me a number: ");
        number=sc.nextInt();      
        
        while(number<min||number>max){
            System.out.println("Please give another number: ");
            number=sc.nextInt();
        }
        return number;
                }
    public String getString(){
        System.out.println("What kind of math would you like to do today?");
        math=sc.next();
        return math;
        }
    public float getFloat(){
        System.out.println("Give me a number: ");
        num=sc.nextFloat();
        return num;
    }
    
    public float rightFloat(){
        System.out.println("Give me a number: ");
        num = sc.nextFloat();
        while(num<min||num>max){
            System.out.println("Please give another number: ");
            num=sc.nextFloat();
        }
        return num;
        }
         public double getDouble(){
        System.out.println("Give me a number: ");
        num1=sc.nextDouble();
        return num1;
    }
    
    public double rightDouble(){
        System.out.println("Give me a number: ");
        num1 = sc.nextFloat();
        while(num1<min||num1>max){
            System.out.println("Please give another number: ");
            num1=sc.nextFloat();
        }
        return num1;
        }
        
    public void printString(int result){
        System.out.println("The result is: "+result);
    }
        
    }

