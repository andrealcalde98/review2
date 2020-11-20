/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author analc
 */
public class CalculadorDeFracciones {

    private Fraccion operador1;

    private Fraccion operador2;

    public CalculadorDeFracciones(Fraccion operador1, Fraccion operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    ///  para mismo denominador
    public Fraccion suma() {
        
        Fraccion fr = new Fraccion(operador1.getNumerador() + operador1.getNumerador(), operador1.getDenominador());
        return simplify(fr);    
    }

    public Fraccion resta() {
        Fraccion resta =  new Fraccion(operador1.getNumerador() - operador2.getDenominador(), operador1.getDenominador());
        return simplify(resta);
    }

    public Fraccion division() {
        Fraccion division = new Fraccion(operador1.getNumerador() * operador2.getDenominador(), operador1.getDenominador() * operador2.getDenominador());
        return simplify(division);    
    }
    
    public Fraccion multi() {
        Fraccion multi = new Fraccion(operador1.getNumerador() * operador2.getNumerador(), operador1.getDenominador() * operador2.getDenominador());
        return simplify(multi);    
    }
    

    private double mcd(double d1, double d2) {
        
        double temporal;//Para no perder b
        while (d2 != 0) {
            temporal = d2;
            d2 = d1 % d2;
            d1 = temporal;
        }
        return d1;
    }

    private Fraccion simplify(Fraccion fraccion) {
        double mcd = mcd(fraccion.getNumerador(), fraccion.getDenominador());
        return new Fraccion(fraccion.getNumerador() / mcd, fraccion.getDenominador() / mcd);

    }
}
