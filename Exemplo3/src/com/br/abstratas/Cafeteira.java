package com.br.abstratas;

import javax.swing.JOptionPane;

public class Cafeteira extends Eletronico {

	public Cafeteira(){
		//this.operacao();		
	}

	@Override
	public void operacao() {
		JOptionPane.showMessageDialog(null, "CAFEZAO MILGRAU");
	}

	
}
