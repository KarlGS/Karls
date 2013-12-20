package com.swcguild.histogram;

import java.util.ArrayList;
import java.util.HashMap;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    /**
     * Test of mapIt method, of class App.
     */
    public void testMapIt() {
        System.out.println("mapIt");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        numbers.add(23);
        numbers.add(23);
        numbers.add(22);
        numbers.add(22);
        App instance = new App();
        HashMap expResult = new HashMap();
        expResult.put(2, 3);
        expResult.put(23, 2);
        expResult.put(22, 2);
        HashMap result = instance.mapIt(numbers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    
    }

    /**
     * Test of printHistogram method, of class App.
     */
//    public void testPrintHistogram() {
//        System.out.println("printHistogram");
//        HashMap<Integer, Integer> h = null;
//        App instance = new App();
//        instance.printHistogram(h);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
