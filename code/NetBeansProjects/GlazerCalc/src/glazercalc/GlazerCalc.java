/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glazercalc;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class GlazerCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height;
        double width;
        double area;
        double perimeter;
        // trim costs $1.10/ linear foot
        double trimCostLinearFoot;
        // glass costs $3.45 / square foot
        double glassCostSquareFoot;
        double subTotalTrimCost;
        double subTotalGlassCost;
        double labor =17;
        double time;
        double laborCost;
        String wmessage="Please enter a width, ";
        String hmessage="Please enter a height, ";
        final double MIN_WIDTH = 1;
        final double MAX_WIDTH = 20;
        final double MIN_HEIGHT =1;
        final double MAX_HEIGHT =20;
        double finalCost;

        System.out.println("What is the price of wood trim per foot: ");
        trimCostLinearFoot=sc.nextDouble();
        System.out.println("What is the price of glass per square foot: ");
        glassCostSquareFoot = sc.nextDouble();
        
        
        width=readDouble(wmessage,MIN_WIDTH,MAX_WIDTH);
        height=readDouble(hmessage,MIN_HEIGHT,MAX_HEIGHT);
        
        
    
        
        
            
        
        perimeter = (2 * width) + (2 * height);
        area = width * height;
        time = area * 15;
        laborCost=(time/60)*labor;
        if(time%15>0){
            laborCost+=4.25;
        }
        
        subTotalTrimCost = perimeter * trimCostLinearFoot;
        subTotalGlassCost = area * glassCostSquareFoot;
        finalCost = subTotalTrimCost + subTotalGlassCost + laborCost;

        System.out.println("The area of the window is = " + area + "sqft");
        System.out.println("The cost for glass you entered = $" + glassCostSquareFoot);
        System.out.println("The total cost for the glass is = $" + subTotalGlassCost);
        System.out.println("*****************************************************");
        System.out.println("The length of trim needed = " + perimeter + "lft");
        System.out.println("The cost for trim you entered  = $" + trimCostLinearFoot);
        System.out.println("The total cost for the trim is = $" + subTotalTrimCost);
        System.out.println("*****************************************************");
        System.out.println("The labor cost is "+laborCost);
        System.out.println("The final total of glass and trim is = $" + finalCost);
        System.out.println("Thank you for your business!");

    
        
    
        
        }
    public static double readDouble(String prompt,double low,double high){
        double result = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println(prompt +" between "+low+" and "+high);
            result= sc.nextDouble();
        } while(result<low||result>high);
        
        
        return result;
    }
}
