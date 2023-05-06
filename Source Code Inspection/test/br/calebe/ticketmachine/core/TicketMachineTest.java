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
 * @author eijik
 */
public class TicketMachineTest {
    
    public TicketMachineTest() {
    }

    /**
     * Test of inserir method, of class TicketMachine.
     */
    @Test
    public void testInserir() throws Exception {
        System.out.println("inserir");
        int quantia = 10;
        TicketMachine instance = new TicketMachine(5);
        instance.inserir(quantia);
        
        System.out.println(instance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        assertEquals(10,instance.getSaldo() );
    }

    /**
     * Test of getSaldo method, of class TicketMachine.
     */
    
    @Test
    public void testGetSaldo() throws Exception {
        System.out.println("getSaldo");
        TicketMachine instance = new TicketMachine(5);
       
        instance.inserir(100);
     
        assertEquals(100,instance.getSaldo() );
    }

    /**
     * Test of getTroco method, of class TicketMachine.
     */
    
    @Test
    public void testGetTroco() throws Exception{
        System.out.println("getTroco");
        TicketMachine instance = new TicketMachine(5);
        
        instance.inserir(50);
        instance.inserir(5);

        Iterator<PapelMoeda> result = instance.getTroco();


        int[] expectedResult = new int[]{0,1,0,0,1,0};
        
        int count = 0;
        while(result.hasNext()){
            
            PapelMoeda papelMoeda = result.next();
            assertEquals(expectedResult[count], papelMoeda.getQuantidade());
            
            count++;

        }
    }
    
    /**
     * Test of imprimir method, of class TicketMachine.
     */
    
    @Test
    public void testImprimir() throws Exception {
        System.out.println("imprimir");
        
        TicketMachine instance = new TicketMachine(5);
        instance.inserir(100);
        
        String expResult =  "*****************\n" +
                            "*** R$ 95,00 ****\n" +
                            "*****************\n";
        
        String result = instance.imprimir();
        
        
        assertEquals(expResult, result);
    }
    
}
