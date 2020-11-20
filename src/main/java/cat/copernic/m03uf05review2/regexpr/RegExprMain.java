/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.regexpr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author pep
 */
public class RegExprMain {

    /**
     * Expresión regular que valide NIF
     */
    public static boolean ValidateNif(String nif) {
        Pattern p = Pattern.compile("\\d{8}[A-Z&&[^AEIOU]]");
        Matcher m = p.matcher(nif);
        return m.matches();
    }

    /**
     * Expresión regular que valide NIE
     */
    public static boolean ValidateNie(String nie) {
        Pattern p = Pattern.compile("[A-Z]\\d{7}[A-Z]");
        Matcher m = p.matcher(nie);
        return m.matches();
    }

    /**
     * Expresión regular que valide un telefono de movil
     */
    public static boolean ValidateNum(String num) {
        Pattern p = Pattern.compile("(6|9)\\d{8}");
        Matcher m = p.matcher(num);
        return m.matches();
    }

    /**
     * Expresión regular que valide un telefono de España
     */
    public static boolean ValidateNumEsp(String numesp) {
        Pattern p = Pattern.compile("(\\+346|\\+349)\\d{8}");
        Matcher m = p.matcher(numesp);
        return m.matches();
    }

    /**
     * Expresión regular que valide una matricula
     */
    public static boolean ValidateMat(String mat) {
        Pattern p = Pattern.compile("\\d{4}[A-Z&&[^AEIOU]]{3}");
        Matcher m = p.matcher(mat);
        return m.matches();
    }

    /**
     * Expresión regular que valide una fecha formato dd/mm/aaaa
     */
    public static boolean ValidateFecha(String fecha) {
        Pattern p = Pattern.compile("^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$");
        Matcher m = p.matcher(fecha);
        return m.matches();
    }

    /**
     * Expresión regular que valide un email
     */
    public static boolean ValidateEmail(String email) {
        Pattern p = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
        Matcher m = p.matcher(email);
        return m.matches();
    }

    /**
     * Expresión regular que valide una clave en la forma AA999AA donde la
     * segunda AA es igula a la primera
     */
    public static boolean ValidateClave(String clave) {
        Pattern p = Pattern.compile("^((\\p{Alpha}\\p{Alpha})(\\d{3}))\\2$");
        Matcher m = p.matcher(clave);
        return m.matches();
    }

    /**
     * @param args the command line arguments Regular expressions are a way to
     * describe a set of strings based on common characteristics shared by each
     * string in the set
     *
     * A Pattern object is a compiled representation of a regular expression
     *
     * A Matcher object is the engine that interprets the pattern and performs
     * match operations against an input string
     *
     * A PatternSyntaxException object is an unchecked exception that indicates
     * a syntax error in a regular expression pattern
     *
     */
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("^(\\p{Lower}|\\p{Digit})+$");
//        Matcher m1 = p.matcher("a9");
//        Matcher m2 = p.matcher("ab8");
//        boolean b1 = m1.matches();
//        boolean b2 = m2.matches();
//        String nif = "99999999A";
//        System.out.println(b1);
//        System.out.println(b2);

//        final String REGEX = "\\bdog\\b";
//        final String INPUT = "dog dog dog doggie dogg";
//        Pattern p = Pattern.compile(REGEX);
//        //  get a matcher object
//        Matcher m = p.matcher(INPUT);
//        int count = 0;
//        while (m.find()) {
//            count++;
//            System.out.println("Match number "
//                    + count);
//            System.out.println("start(): "
//                    + m.start());
//            System.out.println("end(): "
//                    + m.end());
//        }
        System.out.println(
                Pattern
                        .compile("(\\d\\d)\\1")
                        .matcher("1212")
                        .matches());

        System.out.println(Pattern
                .compile("((\\d\\d)(\\p{Alpha}\\p{Alpha}))\\3*")
                .matcher("12aBaBaBaB")
                .matches());

        System.out.println(ValidateClave("AA999AA"));
        
        
    }

}
