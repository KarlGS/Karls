/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package functionsmethods;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AreaCalculator {
    
public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int choice;
     int base;
     int height;
     int length;
     int width;
     int side;
     int radius;
     int answer;
     
     System.out.println("Shape Area Calculator version 0.1 (c) 2005 Mitchell Sample Output, inc");
     do{
     System.out.println("\n-=-=-=-=-=-=-=-=--=-=--=-=-=-=--=-=-=-=-");
     System.out.println("\n1) Triangle");
     System.out.println("\n2)Rectangle");
     System.out.println("\n3)Square");
     System.out.println("\n4)Circle");
     System.out.println("\n5)Quit");
     
     
     
     System.out.println("Which Shape: ");
     choice=sc.nextInt();
     
     if(choice==1){
         System.out.println("Base: ");
         base=sc.nextInt();
         System.out.println("Height: ");
         height=sc.nextInt();
         
         System.out.println("The area is "+area_triangle(base, height));
     } else if(choice==2){
         System.out.println("Length: ");
         length=sc.nextInt();
         System.out.println("Width: ");
         width=sc.nextInt();
         System.out.println("The area is "+area_rectangle(length,width));
     }else if(choice==3){
         System.out.println("Side length: ");
         side=sc.nextInt();
         System.out.println("The area is "+area_square(side));
         
     }else if(choice==4){
         System.out.print("Radius: ");
         radius=sc.nextInt();
         System.out.println("Thea area is " + area_circle(radius));
     }else{
         System.out.println("\nGoodbye!");
         break;
     }
     }while(choice>=1&&choice<=4);
}
   public static double area_circle(int radius){
       return Math.PI * Math.pow(radius, 2);
        
   }
    public static int area_rectangle(int length, int width) {
        return length * width;
   
    }
    public static int area_square(int side) {
        return (int) Math.pow(side, 2);
    }
    public static double area_triangle (int base, int height) {
        return .5*base*height;
    }
}