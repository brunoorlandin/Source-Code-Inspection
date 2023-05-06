/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.calebe.ticketmachine.core;

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
public class PapelMoedaTest {
    
    public PapelMoedaTest() {
    }


    /**
     * Test of getValor method, of class PapelMoeda.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
       
        PapelMoeda instance = new PapelMoeda(10, 5);
        
        int expResult = 10;
        int result = instance.getValor();
        assertEquals(expResult, result);

    }

    /**
     * Test of getQuantidade method, of class PapelMoeda.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        
        
        PapelMoeda instance = new PapelMoeda(10, 5);
        
        int expResult = 5;
        int result = instance.getQuantidade();
        assertEquals(expResult, result);
   
    }
    
}
