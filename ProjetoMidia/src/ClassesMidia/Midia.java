package ClassesMidia;

import java.util.Scanner;

public class Midia {

    private int codigo;
    private double preco;
    private String nome;

    public Midia(){
    
    }
    
    public Midia(int codigo, String nome, double preco){
        
        this.codigo = codigo;
        this.nome = nome;
        this.codigo = codigo;
    
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void printDados(){
        
        System.out.println("Nome: "+getNome()+"\n Codigo: "+getCodigo()+"\n Preço: "+getPreco());
    }
    
    public String getTipo(){
    
        return this.toString();
    }
    
        public String getDetalhes(){
    
        return this.toString();
    }
    
    
    public void inserirDados(){
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Insira o nome: ");
        setNome(scn.nextLine());
        
        System.out.println("Insira o Código: ");
        setCodigo(scn.nextInt());
        
        System.out.println("Insira o Preço: ");
        setPreco(scn.nextDouble());
        
        
    }

}
