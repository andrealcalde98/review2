/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pep
 *
 * Las exceptions derivadas de RuntimeException y las propia RuntimeException
 * son excepciones unchecked (no necesita try-catch). El resto sí.
 */
public class ExceptionMain {

    static double division(double a, double b) throws Exception {
        if (b == 0) {
            // chained (encadenadas) exceptions
            throw new Exception("denominador no puede ser 0", new IllegalArgumentException("argumento incorrecto", new IllegalAccessError()));
        }
        return a / b;
    }

    static String readFirstLineFromFile(String path) throws IOException {

        // try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }

    }

    public static void main(String[] args) throws ElFicheroNoExisteException, NoPotSerMesGranQueNou, Exception {

        /*try {
            System.out.println(readFirstLineFromFile("data.txt"));
        } catch (IOException e) {
            throw new ElFicheroNoExisteException();
        } //catch (ElFicheroNoExisteException ex) {
        //  System.out.println(ex.getMessage());
        // ex.printStackTrace();
        // Logger.getLogger(ExceptionMain.class.getName()).log(Level.SEVERE, null, ex);
        //}
        finally {

        }*/
        try {
            double d = 0;
            d = division(20.0, 2.0);
            
            if (d > 9) {
                throw new NoPotSerMesGranQueNou();
            } else {
                System.out.println(d);
            }
        } catch (NoPotSerMesGranQueNou ex) {
            throw new NoPotSerMesGranQueNou("Aquest número es més gran que nou");
        } finally {
            System.out.println("en finally");
        }
    }
}
