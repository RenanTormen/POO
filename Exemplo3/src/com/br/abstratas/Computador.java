package com.br.abstratas;

import javax.swing.JOptionPane;

public class Computador extends Eletronico {
	
	public Computador(){
		//this.operacao();		
	}

	@Override
	public void operacao() {
		JOptionPane.showMessageDialog(null, "TELA AZUL DA MORTE");
	}

}
