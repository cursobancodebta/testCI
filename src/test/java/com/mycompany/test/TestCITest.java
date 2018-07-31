/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jpramirez
 */
public class TestCITest {
    
    public TestCITest() {
    }

    /**
     * Test of sum method, of class TestCI.
     */
    @org.junit.Test
    public void testSum() {
        System.out.println("sum");
        int n1 = 1;
        int n2 = 2;
        TestCI instance = new TestCI();
        int expResult = 3;
        int result = instance.sum(n1, n2);
        assertEquals(expResult, result);

    }

    
}
