package com.br.abstratas;

public class Principal {

	public static void main(String[] args) {
		Eletronico cafeteira = new Cafeteira();
		Eletronico computador = new Computador();
		
		cafeteira.liga();
		cafeteira.estaLigado();
		cafeteira.operacao();
		
		computador.liga();
		computador.estaLigado();
		computador.operacao();
	}
	
}
