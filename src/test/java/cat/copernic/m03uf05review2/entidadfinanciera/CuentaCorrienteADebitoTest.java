/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.entidadfinanciera;

import calc.CalculadorDeFracciones;
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
public class CuentaCorrienteADebitoTest {
    
    private CuentaCorrienteADebito instance;
    
    public CuentaCorrienteADebitoTest() {
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
        instance = new CuentaCorrienteADebito("Patricio", 200.0); 
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of abona method, of class CuentaCorrienteADebito.
     */
    @Test
    public void testAbona() {
        double abono = 150.0;
        instance.abona(abono);
                
        assertEquals(50.0, instance.getSaldo(), 0.01);
        
        System.out.println("Operación finalizada");
    }
    
    @Test
    public void testIngresa() {
        double ingresa = 150.0;
        instance.ingresa(ingresa);
                
        assertEquals(350.0, instance.getSaldo(), 0.01);
        
        System.out.println("Ingres efectuat");
    }

    public class CuentaCorrienteADebitoImpl extends CuentaCorrienteADebito {

        public CuentaCorrienteADebitoImpl() {
            super("", 0.0);
        }
    }
    
}
