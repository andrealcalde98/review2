/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.generics.collections.exercici;

/**
 *
 * @author pep
 */
public class Match implements Comparable<Match> {

    private Persona persona;
    private Persona candidato;
    // cuanto mayor es este peso, mayor la afinidad entre persona y candidato
    private double weight;

    public Match(Persona persona, Persona candidato, double weight) {
        this.persona = persona;
        this.candidato = candidato;
        this.weight = weight;
    }

    public Persona getPersona() {
        return persona;
    }

    public Persona getCandidato() {
        return candidato;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Match{" + "persona=" + persona + ", candidato=" + candidato + ", weight=" + weight + '}';
    }

    @Override
    public int compareTo(Match match) {
        if (weight < match.weight) {
            return -1;
        } else if (weight == match.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}
