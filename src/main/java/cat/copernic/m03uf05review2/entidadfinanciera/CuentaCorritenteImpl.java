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
public abstract class CuentaCorritenteImpl implements CuentaCorriente {
    
    public String titular;
    public double saldo;
    
    public CuentaCorritenteImpl(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaCorritenteImpl{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }

    @Override
    public void ingresa(double ingreso) {
        if (ingreso > 0.0){
            saldo += ingreso;
        }
        else if (ingreso == 0) {
            try {
                throw new Exception("Debes ingresar una cantidad");
            } catch (Exception e) {
                Logger.getLogger(CuentaCorriente.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

}
