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
public class GenericsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       Caixa caixa1 = new Caixa("Una cadena"); // String
//       Caixa caixa2 = new Caixa(1); // Integer
//       // conversio de tipus // Cast
//       String content = (String) caixa2.getContent();
//        System.out.println(content);

        CaixaGenerica<String> caixa1 = new CaixaGenerica<String>("contenido generico");
        CaixaGenerica<Integer> caixa2 = new CaixaGenerica<Integer>(2);
        
        Integer content = caixa2.getContent();
    }
    
}
