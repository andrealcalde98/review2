/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.generics.collections.exercici;

import java.util.List;

/**
 *
 * @author pep
 */
public interface Matcher {
    
    /**
     * 
     * @param persona La persona que busca otra persona afin
     * @param candidatos La lista de candidatos
     * @return La persona de la lista de candidatos con más afinidad a persona
     */
    Persona matches(Persona persona, List<Persona> candidatos);
    
}
