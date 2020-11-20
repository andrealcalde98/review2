/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

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
public class CalculadorDeFraccionesTest {
    
    private CalculadorDeFracciones instance;
    
    public CalculadorDeFraccionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Inciando..");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finalizando..");
    }
    
    @Before
    public void setUp() {
        Fraccion f1 = new Fraccion(2,3);
        Fraccion f2 = new Fraccion(2,3);
        instance = new CalculadorDeFracciones(f1, f2);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class CalculadorDeFracciones.
     */
    @Test
    public void testSuma() {
        assertEquals(new Fraccion(4.0,3.0), instance.suma());
    }
    @Test
    public void testResta() {
        assertEquals(new Fraccion(1.0,3.0), instance.resta());
    }
    @Test
    public void testdivision() {
        assertEquals(new Fraccion(2.0,3.0), instance.division());
    }
    @Test
    public void testmulti() {
        assertEquals(new Fraccion(4.0,9.0), instance.multi());
    }
}
