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
public class FlooringCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Console floor1= new Console();
        double perunit;
        double width;
        double length;
        double area;
        double laborTime;
        double total;
        double per20=21.50;
        
        perunit= floor1.getCost();
        width = floor1.getWidth();
        length = floor1.getLength();
        area = floor1.getArea(length, width);
        laborTime = floor1.getLaborTime(area);
        total= floor1.getTotal(laborTime, per20, perunit);
        
        
    }
}
