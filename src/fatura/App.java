
package fatura;

/**
 *
 * @author rodolfo
 */

public class App {

    public static void main(String[] args) {
        
        Fatura conta = new Fatura("1","switch",400,2);
        
        conta.respostas();
        
        conta.perguntas();
        
        conta.respostas();
    }
    
}
