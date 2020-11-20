/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.regexpr;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
//import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author pep https://junit.org/junit5/docs/current/user-guide/
 *
 *
 */
//@Disabled("sfg")
public class RegExprMainTest {

    public RegExprMainTest() {
    }

    /**
     * Aquest nmètode s'executa abans de tots els tests
     */
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciant tests");
    }

    /**
     * Aquest mètode s'executa al final de tots els tests
     */
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabant tests");
    }

    /**
     * Aquest mètode s'executa abans de cada test
     */
    @Before
    public void setUp() {
    }

    /**
     * Aquest mètode s'executa després de cada test
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of ValidateNif method, of class RegExprMain.
     */
    @ParameterizedTest
    @ValueSource(strings = {"23456789B", "23456789C"})
    void testValidateNifTrue(String nif) {
        assertTrue(RegExprMain.ValidateNif(nif));
    }
    
        /**
     * Test of ValidateNif method, of class RegExprMain.
     */
    @ParameterizedTest
    @ValueSource(strings = {"23456789A", "23456789"})
    void testValidateNifFalse(String nif) {
        assertFalse(RegExprMain.ValidateNif(nif));
    }

    /**
     * Test of ValidateNie method, of class RegExprMain.
     */
    @Test
    //@Disabled
    @Ignore
    public void testValidateNie() {

    }

    /**
     * Test of ValidateNum method, of class RegExprMain.
     */
    @Test
    // @Disabled
    @Ignore
    public void testValidateNum() {

    }

    /**
     * Test of ValidateNumEsp method, of class RegExprMain.
     */
    @Test
    // @Disabled
    @Ignore
    public void testValidateNumEsp() {

    }

    /**
     * Test of ValidateMat method, of class RegExprMain.
     */
    @Test
    // @Disabled
    @Ignore
    public void testValidateMat() {

    }

    /**
     * Test of ValidateFecha method, of class RegExprMain.
     */
    @Test
    // @Disabled
    @Ignore
    public void testValidateFecha() {

    }

    /**
     * Test of ValidateEmail method, of class RegExprMain.
     */
    @Test
    // @Disabled
    @Ignore
    public void testValidateEmail() {

    }

    /**
     * Test of ValidateClave method, of class RegExprMain.
     */
    @Test
    // @Disabled
    @Ignore
    public void testValidateClave() {

    }

}

//        assertAll("nifs",
//                () -> {
//                    assertTrue(RegExprMain.ValidateNif("23456789B"));
//                },
//                () -> {
//                    assertTrue(RegExprMain.ValidateNif("23456789B"));
//                });
