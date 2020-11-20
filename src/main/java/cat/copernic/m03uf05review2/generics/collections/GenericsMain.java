/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.generics.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class AlumnoEdadComparator implements Comparator<Alumno> {

    /**
     *
     * @param o1
     * @param o2
     * @return -1 si o1 < o2, 0 si o1 == o2; +i si o1 > o2
     */
    @Override
    public int compare(Alumno o1, Alumno o2) {
        if (o1.getEdad() < o2.getEdad()) {
            return -1;
        } else if (o1.getEdad() == o2.getEdad()) {
            return 0;
        } else {
            return 1;
        }
    }
}

    /**
     *
     * @author pep
     */
    public class GenericsMain {

        /**
         * Escribe un método genericl que retorne el ultimo elemento de una
         * lista
         */
        public static <T> T ultimo(List<T> lista) throws Exception {
            if (lista.isEmpty()) {
                throw new Exception("Lista vacia");
            }
            return lista.get(lista.size() - 1);
        }

        /**
         * Escribe una método que retorne la media de una lista de Double
         */
        public static double media(List<Double> lista) {
            double d = 0;

//        for (Iterator it = lista.iterator(); it.hasNext();) {
//            d += (double) it.next();
//        }
            for (int i = 0; i < lista.size(); i++) {
                d = +lista.get(i);
            }

            return d / lista.size();

        }

        /**
         * Escribe un método que retorne la cadena mas larga de una lista de
         * String
         */
        public static String masLargo(List<String> lista) {

            int auxInt = 0;

            String auxStr = null;

            for (int i = 0; i < lista.size(); i++) {
                String s = lista.get(i);
                if (s.length() > auxInt) {
                    auxStr = s;
                    auxInt = s.length();
                }

            }

            return auxStr;
        }

        /**
         * Escribe un método que retorne el maximo de una lista de enteros
         */
        public static int maximo(List<Integer> lista) {
            return 0;
        }

        /**
         * Escribe un método que retorne el numero mas repedido
         */
        public static int masRepetido(List<Integer> lista) {
            return 0;
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            
            List<Alumno> list = new ArrayList<>();
            list.add(new Alumno("pepe", 34));
            list.add(new Alumno("ana", 24));
            list.add(new Alumno("joan", 44));
            list.add(new Alumno("tere", 14));
            list.add(new Alumno("marc", 21));
            Collections.sort(list, new AlumnoEdadComparator());
            System.out.println(list);
        }

    }



//        Map<Integer, Alumno> mapa = new HashMap<>();
//        mapa.put(1, new Alumno("Pepe", 34));
//        mapa.put(1, new Alumno("Jose", 44));
//        mapa.put(2, new Alumno("Anna", 28));
//        mapa.put(3, new Alumno("Marc", 44));
//        
//        Set<Integer> claves = mapa.keySet();
//        
//        for(Iterator it = claves.iterator(); it.hasNext();) {
//            System.out.println(mapa.get(it.next()));
//        }
//                
//        Collection<Alumno> col = mapa.values();
//        
//        for(Iterator it = col.iterator(); it.hasNext();) {
//            System.out.println(it.next());
//        }
//  
//        Alumno alumno = mapa.get(3);
//        System.out.println(alumno);

//        Set<Alumno> set = new HashSet<>();
//        set.add(new Alumno("Pepe", 34));
//        set.add(new Alumno("Ana", 28));
//        set.add(new Alumno("Pere", 45));
//        set.add(new Alumno("Pepe", 34));
//
//        for (Iterator it = set.iterator(); it.hasNext();) {
//            System.out.println(it.next());
//        }
//        List<String> lista1 = new ArrayList<>();
//
//        lista1.add("Marta");
//        lista1.add("Eva");
//        lista1.add("Joan");
//        lista1.add("Carles");
//        lista1.add("Pep");
//        if (lista1.isEmpty()) {
//            System.out.println("Lista es buida");
//        } else {
//            System.out.println("Lista te " + lista1.size() + " elements.");
//        }
//        
//        lista1.remove("Carles");
////        
////        for (int i = 0; i < lista1.size(); i++) {
////            System.out.println(lista1.get(i));
////        }
//        
//        for(Iterator<String> it = lista1.iterator(); it.hasNext();) {
//            System.out.println(it.next());
//        }
//        
//        List<String> l2 = lista1.subList(0, lista1.size()/ 2);

