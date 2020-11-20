/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.entidadfinanciera;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author analc
 */
public class CuentaCorrienteACreditoPlatinumTest {
    
    private CuentaCorrienteACreditoPlatinum instance;
    
    public CuentaCorrienteACreditoPlatinumTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Inciando..");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new CuentaCorrienteACreditoPlatinum("Patricio", 200.0); 
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of abona method, of class CuentaCorrienteACreditoPlatinum.
     */
    @Test
    public void testAbona() {
        double abono = 5000.0;
        instance.abona(abono);
                
        assertEquals(-4800.0, instance.getSaldo(), 0.01);
        
        System.out.println("Operación finalizada");
    }
    
    @Test
    public void testIngresa() {
        double ingresa = 150.0;
        instance.ingresa(ingresa);
                
        assertEquals(350.0, instance.getSaldo(), 0.01);
        
        System.out.println("Ingres efectuat");
    }
}
