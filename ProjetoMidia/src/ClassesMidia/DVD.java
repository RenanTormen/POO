package ClassesMidia;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class DVD extends Midia {
    
    public DVD(){
    
    }

    private int nFaixas;
    
    
    public DVD(int nFaixas){
    
        super();
        this.setnFaixas(nFaixas);
        
    }

    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

    @Override
    public String getTipo() {

        return " \n DVD";

    }

    @Override
    public String printDados() {
        return super.printDados() + "\n Número de faixa: " + this.getnFaixas();
    }

    @Override
    public void inserirDados() {

       /* Scanner scn = new Scanner(System.in);
        System.out.println("Insira o nome: ");
        this.setNome(scn.nextLine());*/
       
        this.setNome(JOptionPane.showInputDialog(null,"Digite o nome"));

        this.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código")));

        this.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço")));

        
        this.setnFaixas(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Número de faixas")));

        System.out.println(printDados());

    }

}
