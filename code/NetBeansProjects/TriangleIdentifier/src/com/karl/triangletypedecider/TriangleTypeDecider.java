/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karl.triangletypedecider;


/**
 *
 * @author apprentice
 */
public class TriangleTypeDecider {

    public String findTriangleType(int side1, int side2, int side3) {
        int max = Math.max(Math.max(side1, side2), side3);
        if (max == side1) {
            checkTriangleInequality(side1, side2, side3);
        } else if (max == side2) {
            checkTriangleInequality(side2, side1, side3);
        } else {
            checkTriangleInequality(side3, side1, side2);
        }
        if(side1==side2&&side2==side3){
            return "Equilateral";
        }else if((side1==side2)||(side2==side3||(side1==side3))){
            return "Isoceles";
        }else{
            return "Scalene";
        }
    }

    private static void checkTriangleInequality(int max, int x, int y) {
        if (x + y > 0 && x + y <= max) {
            throw new IllegalArgumentException("Triangle inequality violated");
        }
    }
}
