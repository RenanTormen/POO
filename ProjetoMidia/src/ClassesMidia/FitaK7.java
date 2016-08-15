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
public class FitaK7 extends Midia {

    private int tamanho;

    public FitaK7() {

    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String getTipo() {

        return " \n FITA K7";

    }

    @Override
    public void inserirDados() {

        super.inserirDados();
        this.setTamanho(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho da fita ")));
        System.out.println(printDados());

    }

}
