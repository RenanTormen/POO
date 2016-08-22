package com.br.abstratas;

import javax.swing.JOptionPane;

public abstract class Eletronico {
	
	public abstract void operacao();
	
	private boolean ligado = false;
	
	public void estaLigado(){
		
		if(!ligado){
			JOptionPane.showMessageDialog(null, "Está desligado");
		} else {
			JOptionPane.showMessageDialog(null, "Está ligado");
			
		}
		
	}
	
	public void liga(){
		this.ligado = true;
		JOptionPane.showMessageDialog(null, "Acabou de ligar");
	}

	public void desliga(){
		this.ligado = false;
		JOptionPane.showMessageDialog(null, "Acabou de desligar");
	}
}
