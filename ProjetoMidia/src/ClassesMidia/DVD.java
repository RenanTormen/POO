package ClassesMidia;

import java.util.Scanner;

public class DVD extends Midia {

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

        Scanner scn = new Scanner(System.in);
        System.out.println("Insira o nome: ");
        this.setNome(scn.nextLine());

        System.out.println("Insira o Código: ");
        this.setCodigo(scn.nextInt());

        System.out.println("Insira o Preço: ");
        this.setPreco(scn.nextDouble());

        System.out.println("Insira o numero de faixas: ");
        this.setnFaixas(scn.nextInt());

        System.out.println(printDados());

    }

}
