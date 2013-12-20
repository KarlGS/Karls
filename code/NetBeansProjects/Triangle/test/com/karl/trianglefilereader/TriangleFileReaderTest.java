/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karl.trianglefilereader;

import com.karl.trianglemodel.Triangle;
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
public class TriangleFileReaderTest {
    
    public TriangleFileReaderTest() {
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
     * Test of loadTriangleSides method, of class TriangleFileReader.
     */
    
    
    @Test
    public void testLoadTriangleSides() {
        System.out.println("loadTriangleSides");
        String fileName = "Triangle";
        TriangleFileReader instance = new TriangleFileReader();
        Triangle expResult = new Triangle();
        expResult.setSide1(3);
        expResult.setSide2(3);
        expResult.setSide3(2);
        Triangle result = instance.loadTriangleSides(fileName);
        if (expResult.getSide1() == result.getSide1() && expResult.getSide2() == result.getSide2() && expResult.getSide3() == result.getSide3()) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}