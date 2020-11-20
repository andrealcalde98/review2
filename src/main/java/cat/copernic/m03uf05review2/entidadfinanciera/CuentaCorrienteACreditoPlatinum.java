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
public class CuentaCorrienteACreditoPlatinum extends CuentaCorrienteACredito {

    public CuentaCorrienteACreditoPlatinum(String titular, double saldo) {
        super(titular, saldo);
    }

    /**
     * Esta cuenta permite una descubierto de hasta 5000 €, si es más lanza una
     * exception
     *
     * @param abono
     */
    @Override
    public void abona(double abono) {
        if (getSaldo() + 5000 >= abono){
            setSaldo(getSaldo() - abono);
            System.out.println("Abonat!");
        }
        else {
            try {
                throw new Exception("El descobert esta per sobre de 5000, refusat");
            } catch (Exception e) {
                Logger.getLogger(CuentaCorrienteACreditoGold.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

}
