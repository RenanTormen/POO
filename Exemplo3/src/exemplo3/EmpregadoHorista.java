package exemplo3;

public class EmpregadoHorista extends Empregado {

	private int qtdHoras;
	private double vlrHora;
	
	public double getVlrHora() {
		return vlrHora;
	}

	public void setVlrHora(double vlrHora) {
		this.vlrHora = vlrHora;
	}

	public void setQtdHoras(int qtdHoras){
		
		this.qtdHoras = qtdHoras;
		
	}
	
	public int getQtdHoras(){
		return this.qtdHoras;
	}
	
	public EmpregadoHorista(String primeiro, String ultimo, int qtdHoras, double vlrHoras) {
		super(primeiro, ultimo);
		this.setQtdHoras(qtdHoras);
		this.setVlrHora(vlrHoras);
	}

	@Override
	public double proventos() {
		
		if(this.qtdHoras <= 40){
			
			return this.vlrHora*qtdHoras;
		}
		
		return 40*this.qtdHoras+(this.qtdHoras-40)*this.vlrHora*1.5;
	
	}
	@Override
	public String informacoes(){
		
		return "Nome: "+this.getPrimeiroNome()+" \n"+
			   "Sobrenome: "+this.getUltimoNome()+" \n"+
			   "Total de proventos: "+this.proventos()
				;
	}

}
