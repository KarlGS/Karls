/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WordFactorydao;

import Words.Words;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class WordFactoryTest {
    
    public WordFactoryTest() {
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
     * Test of readWord method, of class WordFactory.
     */
    @Test
    public void testReadWord() {
        System.out.println("readWord");
        WordFactory instance = new WordFactory();
        instance.readWord();

    }

    /**
     * Test of wordSelector method, of class WordFactory.
     */
//    @Test
//    public void testWordSelector() {
//        System.out.println("wordSelector");
//        WordFactory instance = new WordFactory();
//        Word expResult = null;
//        Word result = instance.wordSelector();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of writeWord method, of class WordFactory.
//     */
//    @Test
//    public void testWriteWord() {
//        System.out.println("writeWord");
//        Word newWord = null;
//        WordFactory instance = new WordFactory();
//        instance.writeWord(newWord);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}