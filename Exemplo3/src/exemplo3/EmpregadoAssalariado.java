package exemplo3;

public class EmpregadoAssalariado extends Empregado implements Autenticavel {

	private double salarioSemanal;
	private double salarioMensal;

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		if (salarioSemanal > 0.0) {
			this.salarioSemanal = salarioSemanal;
		} else {
			this.salarioSemanal = salarioSemanal;
		}
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	public EmpregadoAssalariado(String primeiro, String ultimo) {
		super(primeiro, ultimo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double proventos() {
		//
		return 0;
	}

	@Override
	public void autentica() {
		// TODO Auto-generated method stub
		
	}

}
