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
public class Persona implements Comparable<Persona> {

    private int id;
    private Sexo sexo;
    private int edad;
    // en metros
    private double altura;
    // en kgs.
    private double peso;
    private boolean fumador;
    private OrientacionSexual orientacionSexual;
    private Formacion formacion;
    private OrientacionPolitica orientacionPolitica;
    private OrientacionReligiosa orientacionReligiosa;
    private SituacionLaboral situacionLlaboral;
    private ActividadFisica actividadFisica;
    private double ingresosBrutosAnuales;

    public Persona(int id, Sexo sexo, int edad, double altura, double peso,
            boolean fumador, OrientacionSexual orientacionSexual,
            Formacion formacion, OrientacionPolitica orientacionPolitica,
            OrientacionReligiosa orientacionReligiosa,
            SituacionLaboral situacionLlaboral,
            ActividadFisica acrividadFisica, double ingresosBrutosAnuales) {

        this.id = id;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.fumador = fumador;
        this.orientacionSexual = orientacionSexual;
        this.formacion = formacion;
        this.orientacionPolitica = orientacionPolitica;
        this.orientacionReligiosa = orientacionReligiosa;
        this.situacionLlaboral = situacionLlaboral;
        this.actividadFisica = acrividadFisica;
        this.ingresosBrutosAnuales = ingresosBrutosAnuales;
    }

    public int getId() {
        return id;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isFumador() {
        return fumador;
    }

    public OrientacionSexual getOrientacionSexual() {
        return orientacionSexual;
    }

    public Formacion getFormacion() {
        return formacion;
    }

    public OrientacionPolitica getOrientacionPolitica() {
        return orientacionPolitica;
    }

    public OrientacionReligiosa getOrientacionReligiosa() {
        return orientacionReligiosa;
    }

    public SituacionLaboral getSituacionLlaboral() {
        return situacionLlaboral;
    }

    public ActividadFisica getActividadFisica() {
        return actividadFisica;
    }

    public double getIngresosBrutosAnuales() {
        return ingresosBrutosAnuales;
    }
    
    

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", sexo=" + sexo + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", fumador=" + fumador + ", orientacionSexual=" + orientacionSexual + ", formacion=" + formacion + ", orientacionPolitica=" + orientacionPolitica + ", orientacionReligiosa=" + orientacionReligiosa + ", situacionLlaboral=" + situacionLlaboral + ", acrividadFisica=" + actividadFisica + ", ingresosBrutosAnuales=" + ingresosBrutosAnuales + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    /**
     *
     * imc entre 18,5 y 24,9 se interpreta como normal por debado de 18,5 se
     * considera bajo de peso por encima de 25 se considera sobre peso hasta 30
     * preobesidad de 30 a 35 obesidad tipo I de 35 a 40 obesidad tipo II mas de
     * 40 obesidad tipo III
     *
     * @return Indice de Masa Corporal
     */
    public IMC imc() {
        double imc = peso / Math.pow(altura, 2);

        if (imc < 18.5) {
            return IMC.INSUFICIENTE;
        } else if (imc >= 18.5 && imc <= 24.999) {
            return IMC.NORMAL;
        } else if (imc >= 40) {
            return IMC.OBESIDAD_III;
        } else if (imc >= 35) {
            return IMC.OBESIDAD_II;
        } else {
            return IMC.OBESIDAD_I;
        }
    }

    @Override
    public int compareTo(Persona persona) {
        if (id < persona.id) {
            return -1;
        } else if (id == persona.id) {
            return 0;
        } else {
            return 1;
        }
    }

}
