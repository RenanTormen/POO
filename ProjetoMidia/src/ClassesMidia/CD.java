package ClassesMidia;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CD extends Midia {
    
    public CD(){
    
    }

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

        super.inserirDados();
        this.setMusicas(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Número de Musicas")));
        System.out.println(printDados());

    }

}
