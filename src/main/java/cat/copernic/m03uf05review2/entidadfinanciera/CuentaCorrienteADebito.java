/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.entidadfinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pep
 */
public class CuentaCorrienteADebito extends CuentaCorritenteImpl {

    public CuentaCorrienteADebito(String titular, double saldo) {
        //super.saldo = saldo;
        //super.titular = saldo;
        super(titular, saldo);
    }

    /**
     *
     * Solamente se da un abono si hay saldo, si no se lanza una exception
     *
     * @param abono
     */
    @Override
    public void abona(double abono) {

        //System.out.println("Hola" + saldo);
        //To change body of generated methods, choose Tools | Templates.
        //CuentaCorrienteADebito obj = new CuentaCorrienteADebito(titular, saldo);
        if (getSaldo() >= abono) {
            setSaldo(getSaldo() - abono);
            System.out.println("Abonat!");
        } else { System.out.println("No tens saldo per l'operació");
             try {
                throw new Exception("No tens saldo per l'operació");
            } catch (Exception e) {
                Logger.getLogger(CuentaCorrienteADebito.class.getName()).log(Level.SEVERE, null, e);
            }
        }

    }

}
