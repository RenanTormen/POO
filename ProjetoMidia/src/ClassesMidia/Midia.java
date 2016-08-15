package ClassesMidia;

import java.util.Scanner;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

public class Midia {

    private int codigo;
    private double preco;
    private String nome;

    public Midia() {
        this(0, "Nenhum", 0);
    }

    public Midia(int codigo, String nome, double preco) {

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
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("PREÇO BOSTA, COMEÇA DENOVO");
            System.exit(1);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String printDados() {

        return " Nome: " + this.getNome() + " \n Código: " + this.getCodigo() + " \n Preço: " + this.getPreco();
    }

    public String getTipo() {

        return "Midia";
    }

    public String getDetalhes() {
        return this.printDados() + "\n Tipo de mídia: " + this.getTipo();
    }

    public void inserirDados() {

       /* Scanner scn = new Scanner(System.in);
        System.out.println("Insira o nome: ");
        setNome(scn.nextLine());*/
        
        setNome(JOptionPane.showInputDialog(null,"Digite o nome"));
        
        
        /*System.out.println("Insira o Código: ");
        setCodigo(scn.nextInt());*/
        
        setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código")));

        /*System.out.println("Insira o Preço: ");
        setPreco(scn.nextDouble());*/

        setPreco(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço")));
        
    }

}
