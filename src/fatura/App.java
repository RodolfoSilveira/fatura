
package fatura;

/**
 *
 * @author rodolfo
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Fatura conta = new Fatura("1","switch",400,2);
        
        System.out.printf("Numero:%s Descrição: %s Quantidade: %d Preço:R$%.2f "
                + "Valor:R$ %.2f%n",
                conta.getNumero(),conta.getDescricao(),
                conta.getItem(),conta.getPreco(),conta.getInvoiceAmount());
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite numero: ");
        String n = input.nextLine();
        conta.setNumero(n);
        
        System.out.print("Digite descrição: ");
        String d = input.nextLine();
        conta.setDescricao(d);
        
        System.out.print("Digite preço: ");
        double p = input.nextDouble();
        conta.setPreco(p);
        
        System.out.print("Digite quantidade: ");
        int q = input.nextInt();
        conta.setItem(q);
        
        System.out.printf("Numero:%s%nDescrição:%s%nQuantidade:%d%nPreço:R$%.2f%n"
                + "Valor:R$ %.2f%n",
                conta.getNumero(),conta.getDescricao(),
                conta.getItem(),conta.getPreco(),conta.getInvoiceAmount());
    }
    
}
