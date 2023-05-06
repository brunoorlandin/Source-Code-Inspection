/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.calebe.ticketmachine.core;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author unifedogen
 */
public class TrocoTest {
    
    public TrocoTest() {
    }
    
    /**
     * Test of getIterator method, of class Troco.
     */
    @Test
    public void testGetIterator() {
        System.out.println("getIterator");
        Troco instance = new Troco(175);
        
        Iterator<PapelMoeda> expResult = instance.getIterator();
        
        assertEquals(expResult.next().getValor(), 100);
        assertEquals(expResult.next().getValor(), 50);
        assertEquals(expResult.next().getValor(), 20);
        assertEquals(expResult.next().getValor(), 5);
    }
    
}
