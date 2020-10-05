/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.mylib;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author OKO
 */
public class LibClassTest {
    
    public LibClassTest() {
    }
   

    /**
     * Test of acrostic method, of class LibClass.
     */
    @Test
    public void testAcrostic() {
        System.err.println("Running testAcrostic...");
        String result = LibClass.acrostic(new String[] {"fnord", "polly", "tropism"});
        assertEquals("Correct value", "foo", result);
    }
    
}
