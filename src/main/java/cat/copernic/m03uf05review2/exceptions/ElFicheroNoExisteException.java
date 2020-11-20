/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.exceptions;

/**
 *
 * @author pep
 */
public class ElFicheroNoExisteException extends Exception {
/*
    /**
     * Creates a new instance of <code>ElFicheroNoExisteException</code> without
     * detail message.
     */
    
    public ElFicheroNoExisteException() {
    }

    /**
     * Constructs an instance of <code>ElFicheroNoExisteException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public ElFicheroNoExisteException(String msg) {
        super("No existeix el fitxer");
    }

    public ElFicheroNoExisteException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElFicheroNoExisteException(Throwable cause) {
        super(cause);
    }

    public ElFicheroNoExisteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
