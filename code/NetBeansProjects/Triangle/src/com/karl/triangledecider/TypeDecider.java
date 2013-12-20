/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karl.triangledecider;

/**
 *
 * @author apprentice
 */
public class TypeDecider {
    //findTriangleType uses checkTriangleInequality method to check for triangle inequality

    public String findTriangleType(int side1, int side2, int side3) {
        String result = "non-existent. You did not give the correct dimensions for a triangle!";
        try {
            checkTriangleInequality(side1,side2,side3);
                if (side1 < 1 || side2 < 1 || side3 < 1) {
                    return result;
                } else if (side1 == side2 && side2 == side3) {
                    result = "Equilateral";
                    return result;
                } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                    result = "Isoceles";
                    return result;
                } else {
                    result = "Scalene";
                    return result;
                }
            }  catch (IllegalArgumentException ex) {
            System.out.println("\nTriangle inequality violated :(");
        }
        return result;
    }

    private static void checkTriangleInequality(int side1, int side2, int side3) {
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
            throw new IllegalArgumentException();
        }
    }
}
