package exemplo3;

public abstract class Empregado {

	private String primeiroNome;
	private String ultimoNome;

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public int getNumSeguro() {
		return numSeguro;
	}

	public void setNumSeguro(int numSeguro) {
		this.numSeguro = numSeguro;
	}

	private int numSeguro;

	public String informacoes(){
			if(this.numSeguro != 0 ){

				return "" +
					"Nome: "+ this.primeiroNome + "\n"+
					"Sobrenome: "+this.ultimoNome+"\n"+
					"Numero do seguro: "+this.numSeguro;
				
			}
				return "" +
						"Nome: "+ this.primeiroNome + "\n"+
						"Sobrenome: "+this.ultimoNome+"\n";
		
	}

	public abstract double proventos();

	public Empregado(String primeiro, String ultimo) {
		this.setPrimeiroNome(primeiro);
		this.setUltimoNome(ultimoNome);
	}

}
