
package fatura;

/**
 *
 * @author rodolfo
 */

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
}
