/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.generics;

/**
 *
 * @author pep
 */

abstract class Barco {}

class BarcoDeGuerra extends Barco {}

class BarcoDeMercancias extends Barco {}



public class ContenedorGenerico<T extends Barco> {
    
}
