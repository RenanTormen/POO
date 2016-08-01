package ClassesMidia;

import java.util.Scanner;

public class CD extends Midia {

    private int musicas;

    public CD(int musicas) {
        super();
        this.setMusicas(musicas);

    }

    @Override
    public String printDados() {
        return super.printDados() + " \n Número de musicas: " + this.getMusicas();
    }

    public int getMusicas() {
        return musicas;
    }

    public void setMusicas(int musicas) {
        this.musicas = musicas;
    }

    @Override
    public String getTipo() {

        return " \n CD";

    }

    @Override
    public void inserirDados() {

        Scanner scn = new Scanner(System.in);
        super.inserirDados();
        System.out.println("Digite o numero de faixas");
        this.setMusicas(scn.nextInt());
        System.out.println(printDados());

    }

}
