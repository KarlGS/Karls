/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flooringcalculator;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */

    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author apprentice
 */
public class Console {

    /**
     * @param args the command line arguments
     */
        Scanner sc= new Scanner(System.in);
        double length;
        double width;
        double cost;
        double area;
        double perunit;
        double per20=21.5;
        double time;
        
        
        public double getCost(){
        System.out.println("Hello, please input the cost of your wood per unit: ");
        perunit=sc.nextDouble();
        return perunit;
        }
        
        public double getWidth(){
        System.out.println("Input the width of your floor: ");
        width=sc.nextDouble();
        return width;
        }
        public double getLength(){
        System.out.println("Input the length: ");
        length=sc.nextDouble();
        return length;
        }
        public double getArea(double length,double width){
        area=length*width;
        
        System.out.println("The area for your floor is "+area);
        return area;
        }
        public double getLaborTime(double area){
        time =area/15;
        if (time%15>0){
            time=(int)time+1;
        }else{
            time=time;
        }
        return time;
        }
        
        public double getTotal(double time, double per20, double perunit){
        cost=time*per20*perunit;
         System.out.println("Your cost including labor will be "+cost);
         return cost;
        }
       
    }



