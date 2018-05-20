
package fatura;

/**
 *
 * @author rodolfo
 */

import java.util.Scanner;

public class Fatura {
    private String numero,descricao;
    private double preco;
    private int item;
    
    public Fatura(String numero,String descricao,double preco, int item){
        this.numero = numero;
        this.descricao = descricao;
        this.preco = preco;
        this.item = item;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setPreco(double valor){
        if(valor < 0){
            this.preco = 0.0;
        }
        this.preco = valor;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void setItem(int item){
        if(item < 0){
            this.item = 0;
        }
        this.item = item;
    }
    
    public int getItem(){
        return this.item;
    }
    
    public double getInvoiceAmount(){
        return this.item * this.preco;
    }
    
    public void perguntas(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite numero: ");
        String n = input.nextLine();
        setNumero(n);
        
        System.out.print("Digite descrição: ");
        String d = input.nextLine();
        setDescricao(d);
        
        System.out.print("Digite preço: ");
        double p = input.nextDouble();
        setPreco(p);
        
        System.out.print("Digite quantidade: ");
        int q = input.nextInt();
        setItem(q);
    }
    
    public void respostas(){
        System.out.printf("Numero:%s Descrição:%s Quantidade:%d Preço:R$%.2f "
                + "Valor:R$%.2f%n",
                getNumero(),getDescricao(),getItem(),getPreco(),
                getInvoiceAmount());
    }
}
