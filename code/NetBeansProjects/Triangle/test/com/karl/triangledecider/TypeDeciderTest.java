/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karl.triangledecider;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class TypeDeciderTest {
    
    public TypeDeciderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findTriangleType method, of class TypeDecider.
     */
    @Test
    public void testFindTriangleType() {
        System.out.println("findTriangleType");
        int side1 = 3;
        int side2 = 5;
        int side3 = 8;
        TypeDecider instance = new TypeDecider();
        String expResult = "non-existent. You did not give the correct dimensions for a triangle!";
        String result = instance.findTriangleType(side1, side2, side3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testFindTriangleType2() {
        System.out.println("findTriangleType");
        int side1 = 0;
        int side2 = 5;
        int side3 = 8;
        TypeDecider instance = new TypeDecider();
        String expResult = "non-existent. You did not give the correct dimensions for a triangle!";
        String result = instance.findTriangleType(side1, side2, side3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testFindTriangleType3() {
        System.out.println("findTriangleType");
        int side1 = 4;
        int side2 = 5;
        int side3 = 8;
        TypeDecider instance = new TypeDecider();
        String expResult = "Scalene";
        String result = instance.findTriangleType(side1, side2, side3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
        @Test
    public void testFindTriangleType4() {
        System.out.println("findTriangleType");
        int side1 = 3;
        int side2 = 3;
        int side3 = 3;
        TypeDecider instance = new TypeDecider();
        String expResult = "Equilateral";
        String result = instance.findTriangleType(side1, side2, side3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testFindTriangleType5() {
        System.out.println("findTriangleType");
        int side1 = 5;
        int side2 = 5;
        int side3 = 8;
        TypeDecider instance = new TypeDecider();
        String expResult = "Isoceles";
        String result = instance.findTriangleType(side1, side2, side3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}