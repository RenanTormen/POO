/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMidia;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Vinil extends Midia {
    
    String artista;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    @Override
    public String getTipo() {

        return " \n Vinil";
    }
    
    @Override
    public void inserirDados() {

        super.inserirDados();
        this.setArtista(JOptionPane.showInputDialog(null, "Digite o artista "));
        System.out.println(printDados());

    }
    
}
